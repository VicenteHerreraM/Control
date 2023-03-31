/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author vice1
 */
public class Factura {
    int numFactura;
    int precioFactura;
    int cantProductos;
    
    public static void valorSuperado(Factura []arreglo){
        int i , cont = 0;
        for (i = 0 ; i < 5 ; i++){
            if(arreglo[i].precioFactura > 200000){
                System.out.println("La factura numero " +arreglo[i].numFactura+ " ha superado el valor de 200.000 pesos");
                cont++;
            }
        }
        System.out.println("Hay " +cont+ " facturas que superan el valor de 200.000 pesos");
    }
}
