/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.*;
import views.*;
import controller.*;
import controllers.ControllerAscendente;
import controllers.ControllerEditorTexto;
import controllers.ControllerMayor3numeros;
import controllers.ControllerOperaciones;
import controllers.ControllerPrincipal;

/**
 *
 */
public class Main {
    
    public static void main (String oamg[]){
        ModelAscendente model_ascendente = new ModelAscendente();
        ViewAscendente view_ascendente = new ViewAscendente();
        
        ModelEditorTexto model_editor_texto = new ModelEditorTexto();
        ViewEditorTexto view_editor_texto = new ViewEditorTexto();
        
        ModelMayor3numeros model_mayor3_numeros = new ModelMayor3numeros();
        ViewMayor3numeros view_mayor3_numeros = new ViewMayor3numeros();
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaaciones = new ViewOperaciones();
        
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        
        Object views[] = new Object[5];
        views[0] = view_ascendente;
        views[1] = view_editor_texto;
        views[2] = view_mayor3_numeros;
        views[3] = view_operaaciones;
        views[4] = view_principal;
        
        ControllerAscendente controller_ascenAscendente = new ControllerAscendente(model_ascendente, views);
        ControllerEditorTexto controller_editor_texto = new ControllerEditorTexto(model_editor_texto, views);
        ControllerMayor3numeros controller_mayor3_numeros = new ControllerMayor3numeros(model_mayor3_numeros, views);
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones, views);
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal, views);
    }
    
}
