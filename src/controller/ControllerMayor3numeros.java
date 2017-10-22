/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelMayor3numeros;
import views.ViewMayor3numeros;

/**
 *
 * 
 */
public class ControllerMayor3numeros {
private final ModelMayor3numeros model_mayor3_numeros;
private final ViewMayor3numeros view_mayor3_numeros;

public ControllerMayor3numeros(ModelMayor3numeros model_mayor3_numeros, Object views[]){
    this.model_mayor3_numeros = model_mayor3_numeros;
    this.view_mayor3_numeros = (ViewMayor3numeros) views[2];
    initView();
}

public void initView(){
        view_mayor3_numeros.jTextField1_NUMERO1.setText("" + model_mayor3_numeros.getNumero_1());
        view_mayor3_numeros.jTextField1_NUMERO2.setText("" + model_mayor3_numeros.getNumero_2());
        view_mayor3_numeros.jTextField1_NUMERO3.setText("" + model_mayor3_numeros.getNumero_3());
        view_mayor3_numeros.jButton1_RESULTADO.addActionListener(e -> jButton1_RESULTADOMouseClicked());
    }
    
    public void jButton1_RESULTADOMouseClicked(){
        model_mayor3_numeros.setNumero_1(Double.parseDouble(view_mayor3_numeros.jTextField1_NUMERO1.getText()));
        model_mayor3_numeros.setNumero_2(Double.parseDouble(view_mayor3_numeros.jTextField1_NUMERO2.getText()));
        model_mayor3_numeros.setNumero_3(Double.parseDouble(view_mayor3_numeros.jTextField1_NUMERO3.getText()));
        model_mayor3_numeros.CalcularMayor();
        view_mayor3_numeros.jTextField1_RESULTADO.setText("Mayor: " + model_mayor3_numeros.getNumero_Mayor());
    }
}
