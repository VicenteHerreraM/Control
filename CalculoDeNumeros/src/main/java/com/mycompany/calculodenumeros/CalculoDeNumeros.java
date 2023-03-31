/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Despues hacer este problema modularizado con funciones
package com.mycompany.calculodenumeros;
import java.util.Scanner;

/**
 *
 * @author vice1
 */
public class CalculoDeNumeros {

    public static void main(String[] args) {
        int resultado , mayor = 0;

                
        Scanner sc = new Scanner(System.in);        
        
        Scanner opcion_A = new Scanner (System.in);
        
        Scanner num1 = new Scanner (System.in);
        Scanner num2 = new Scanner (System.in);
        Scanner num3 = new Scanner (System.in);

        Scanner numOpcionD = new Scanner (System.in);
        
        Primos calculo;
                
        System.out.println("A: Calcular numeros primos");
        System.out.println("B: Ver numero mayor");
        System.out.println("C: Calcular promedio notas");
        System.out.println("D: Decir si son multiplos de 3");
        
        System.out.println("Seleccione una opcion");
        String opcion = sc.nextLine();
        
        System.out.println("Haz elegido la opcion " + opcion);

        switch(opcion)
        {
            case "A":
                System.out.println("La opcion es valida");
                int numero = opcion_A.nextInt();
                calculo = new Primos();
                break;
            
            
            
            case "B":
                System.out.println("La opcion es valida");
                int numero1 = num1.nextInt();
                int numero2 = num2.nextInt();
                int numero3 = num3.nextInt();
                int[]numeros = {numero1 , numero2 , numero3};
                    for (int i = 0 ; i < 3 ; i++){
                        if(numeros[i] > mayor){
                    mayor = numeros[i];
                }
            }
                System.out.println("El numero mayor es "+mayor);
                break;
            
            
            
            case "C":
                System.out.println("La opcion es valida");
                float nota1 = num1.nextFloat();
                float nota2 = num2.nextFloat();
                float nota3 = num3.nextFloat();
                float promedio = (nota1 + nota2 + nota3) / 3;
                System.out.println("El promedio de las 3 notas es "+promedio);
                break;
            
            
            
            case "D":
                System.out.println("La opcion es valida");
                float numOpcD = numOpcionD.nextFloat();
                if(numOpcD%3 == 0){
                    System.out.println("El numero es multiplo de 3");
                }
                else
                    System.out.println("El numero NO es multiplo de 3");
                break;
                
            
            
            default:
                System.out.println("La opcion NO es valida");
                break;
        }
                
        
    }
}
