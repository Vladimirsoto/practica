/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelOperaciones;
import views.ViewOperaciones;

/**
 *
 *
 */
public class ControllerOperaciones {
    private final ModelOperaciones model_operaciones;
    private final ViewOperaciones view_operaciones;
    
    public ControllerOperaciones(ModelOperaciones model_operaciones, Object views[]){
        this.model_operaciones = model_operaciones;
        this.view_operaciones = (ViewOperaciones) views[3];
        initView();
    }
    
    public void initView(){
        view_operaciones.jButton1_SUMA.addActionListener(e -> jButton1_SUMAMouseClicked());
        view_operaciones.jButton1_RESTA.addActionListener(e -> jButton1_RESTAMouseClicked());
        view_operaciones.jButton1_MULTIPLICACION.addActionListener(e -> jButton1_MULTIPLICACIONMouseClicked());
        view_operaciones.jButton2_DIVICION.addActionListener(e -> jButton2_DIVICIONMouseClicked());
        view_operaciones.jTextField1_NUMERO1.setText("" + model_operaciones.getNumero_1());
        view_operaciones.jTextField1_NUMERO2.setText("" + model_operaciones.getNumero_2());
        view_operaciones.jTextField1_RESULTADO.setText("" + model_operaciones.getResultado());
    }
    
    public void jButton1_SUMAMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jTextField1_NUMERO1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jTextField1_NUMERO2.getText()));
        model_operaciones.Sumar();
        view_operaciones.jTextField1_RESULTADO.setText("" + model_operaciones.getResultado());
    }
    
    public void jButton1_RESTAMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jTextField1_NUMERO1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jTextField1_NUMERO2.getText()));
        model_operaciones.Restar();
        view_operaciones.jTextField1_RESULTADO.setText("" + model_operaciones.getResultado());
    }
    
    public void jButton1_MULTIPLICACIONMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jTextField1_NUMERO1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jTextField1_NUMERO2.getText()));
        model_operaciones.Multiplicar();
        view_operaciones.jTextField1_RESULTADO.setText("" + model_operaciones.getResultado());
    }
    
    public void jButton2_DIVICIONMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jTextField1_NUMERO1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jTextField1_NUMERO2.getText()));
        model_operaciones.Dividir();
        view_operaciones.jTextField1_RESULTADO.setText("" + model_operaciones.getResultado());
    }  
}

    

