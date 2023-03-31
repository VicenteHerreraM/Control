/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicafunciones;
import java.util.Scanner;
/**
 *
 * @author vice1
 */
public class PracticaFunciones {

    public static int determinarMayor(){
        int mayor = 0;
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        
        int numero1 = num1.nextInt();
        int numero2 = num2.nextInt();
        int numero3 = num3.nextInt();
        
        int []arreglo = {numero1 , numero2 , numero3};
        
        for(int i = 0 ; i < 3 ; i++){
            if(mayor < arreglo[i]){
                mayor = arreglo[i];
            }
        }
        return mayor;
    }
    
    public static int sacarPromedio(int num1 , int num2 , int num3 , int num4 , int num5){
        int promedio;
        promedio = (num1 + num2 + num3 + num4 + num5) / 5;
        return promedio;
    }
    
    public static void main(String[] args) {
        
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        Scanner num4 = new Scanner(System.in);
        Scanner num5 = new Scanner(System.in);
        
        System.out.println("Ingrese los numeros a comparar");
        System.out.println("El numero mayor es "+determinarMayor());
        System.out.println("");
        
        //Pasando parametros a una funcion
        System.out.println("Ingresa 5 numeros para obtener promedio");
        int numero1 = num1.nextInt();
        int numero2 = num2.nextInt();
        int numero3 = num3.nextInt();
        int numero4 = num4.nextInt();
        int numero5 = num5.nextInt();
        System.out.println("El promedio de los 5 numeros es de " +sacarPromedio(numero1 , numero2 , numero3 , numero4 , numero5));
    }
}
