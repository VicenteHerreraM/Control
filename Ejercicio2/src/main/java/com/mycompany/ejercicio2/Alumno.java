/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author vice1
 */
public class Alumno {
    int edad;
    double estatura;
    
    public static float promAltura(float altura1 , float altura2 , float altura3 , float altura4 , float altura5){
        float promedio;
        promedio = (altura1 + altura2 + altura3 + altura4 + altura5) / 5;
        return promedio;

    }
    
    public static int promedioEdad(int edad1 , int edad2 , int edad3 , int edad4 , int edad5){
        int promedio;
        promedio = (edad1 + edad2 + edad3 + edad4 + edad5) / 5;
        return promedio;
    }
    
    public static int mayorDeEdad(int edad1 , int edad2 , int edad3 , int edad4 , int edad5){
        int cont = 0;
        int[] arregloEdades = {edad1 , edad2 , edad3 , edad4 , edad5};
        for(int i = 0 ; i < 5 ; i++){
            if(arregloEdades[i] > 18){
                cont++;
            }
        }
        return cont;
    }
}
