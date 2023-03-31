/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author vice1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int cantidadProductos;
        
        Factura factura1;
        Factura factura2;
        Factura factura3;
        Factura factura4;
        Factura factura5;
        
        factura1 = new Factura();
        factura1.numFactura = 42069;
        factura1.cantProductos = 13;
        factura1.precioFactura = 150000;
        
        
        factura2 = new Factura();
        factura2.numFactura = 7856;
        factura2.cantProductos = 20;
        factura2.precioFactura = 230000;
        
        
        factura3 = new Factura();
        factura3.numFactura = 539490;
        factura3.cantProductos = 11;
        factura3.precioFactura = 40000;
        
        
        factura4 = new Factura();
        factura4.numFactura = 234567;
        factura4.cantProductos = 47;
        factura4.precioFactura = 576000;
        
        
        factura5 = new Factura();
        factura5.numFactura = 3457;
        factura5.cantProductos = 2;
        factura5.precioFactura = 7710000;
        
        cantidadProductos = (factura1.cantProductos + factura2.cantProductos + factura3.cantProductos + factura4.cantProductos + factura5.cantProductos);
        System.out.println("La suma de los productos es de " +cantidadProductos);
        
        Factura []precioFacturas = {factura1 , factura2 , factura3 , factura4 , factura5};
        Factura.valorSuperado(precioFacturas);
        
    }
}
