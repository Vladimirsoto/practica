/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelEditorTexto;
import views.ViewEditorTexto;


/**
 *
 *
 */
public class ControllerEditorTexto {
    private FileWriter file_writer = null;
    private FileReader file_reader = null;
    private JFileChooser file_chooser = new JFileChooser();
    private final ModelEditorTexto model_editor_texto;
    private final ViewEditorTexto view_editor_texto;
    
    public ControllerEditorTexto(ModelEditorTexto model_editor_texto, Object views[]){
        this.model_editor_texto = model_editor_texto;
        this.view_editor_texto = (ViewEditorTexto) views[1];
        initView();
    }
    
    public void initView(){
        view_editor_texto.jButton1_ABRIR.addActionListener(e -> jButton1_ABRIRMouseClicked());
        view_editor_texto.jButton2_GUARDAR.addActionListener(e -> jButton2_GUARDARMouseClicked());
    }
    
    public void jButton1_ABRIRMouseClicked(){
                try{
            file_chooser.showOpenDialog(view_editor_texto);
            model_editor_texto.setArchivo(file_chooser.getSelectedFile());
            file_reader = new FileReader(model_editor_texto.getArchivo());
            int character = 0;
            String content = "";
            while((character = file_reader.read()) != -1){
                content += (char) character;
            }
            file_reader.close();
            System.out.println(content);
            view_editor_texto.jta_area_trabajo.setText(content);
        }
        catch(FileNotFoundException err){
            System.err.println("Archivo no encontrado");
        }
        catch(IOException err){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                file_reader.close();
            }
            catch(IOException err){
                System.err.println("Error al cerrar");
            }
        }
    }
    
    public void jButton2_GUARDARMouseClicked(){
        try{
        file_writer = new FileWriter(model_editor_texto.getArchivo(),false);
        file_writer.write(view_editor_texto.jta_area_trabajo.getText());
        file_writer.close();
        
        }
        catch(FileNotFoundException err){
            System.err.println("Archivo no Encontrado");
        }
        catch(IOException err){
            System.err.println("Error en el archivo");
        }
        
    }  
}
