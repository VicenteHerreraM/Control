/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopoo;
import java.io.FileNotFoundException;
/**
 *
 * @author vice1
 */
public class ProyectoPOO {

    public static void main(String[] args) throw FileNotFoundException{
        
        Usuario user;
        
        user = new Usuario();
        
        System.out.println("Bienvenido a la aplicacion [Insertar nombre app], partamos con la creaccion de tu cuenta. ");
        user.crearUsuario();
    }
}
