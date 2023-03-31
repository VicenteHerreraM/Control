/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author vice1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int mayorEdad = 0;
        float estaturaSobreProm;
        
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        Scanner num4 = new Scanner(System.in);
        Scanner num5 = new Scanner(System.in);
        
        Scanner alt1 = new Scanner(System.in);
        Scanner alt2 = new Scanner(System.in);
        Scanner alt3 = new Scanner(System.in);
        Scanner alt4 = new Scanner(System.in);
        Scanner alt5 = new Scanner(System.in);
        
        Alumno datoAlumno1;
        Alumno datoAlumno2;
        Alumno datoAlumno3;
        Alumno datoAlumno4;
        Alumno datoAlumno5;
        
        /*datoAlumno1 = new Alumno();
        datoAlumno1.edad = 23;
        if(datoAlumno1.edad > 18){
            mayorEdad++;
        }
        datoAlumno1.estatura = 1.76;
        
        datoAlumno2 = new Alumno();
        datoAlumno2.edad = 18   ;
        if(datoAlumno2.edad > 18){
            mayorEdad++;
        }        
        datoAlumno2.estatura = 1.60;
        
        datoAlumno3 = new Alumno();
        datoAlumno3.edad = 20;
        if(datoAlumno3.edad > 18){
            mayorEdad++;
        }
        datoAlumno3.estatura = 1.80;
        
        datoAlumno4 = new Alumno();
        datoAlumno4.edad = 17;
        if(datoAlumno4.edad > 18){
            mayorEdad++;
        }
        datoAlumno4.estatura = 1.71;
        
        datoAlumno5 = new Alumno();
        datoAlumno5.edad = 24;
        if(datoAlumno5.edad > 18){
            mayorEdad++;
        }
        datoAlumno5.estatura = 1.92;
        
        
        int retornarEdad;
        
        System.out.println("La cantidad de alumnos que tienen mas de 18 años son " +mayorEdad);*/
        
        System.out.println("Ingrese las edades de los alumnos");
        int edad1 = num1.nextInt();
        int edad2 = num2.nextInt();
        int edad3 = num3.nextInt();
        int edad4 = num4.nextInt();
        int edad5 = num5.nextInt();
        System.out.println("El promedio de edades es de "+Alumno.promedioEdad(edad1, edad2, edad3, edad4, edad5));
        System.out.println("Hay " +Alumno.mayorDeEdad(edad1, edad2, edad3, edad4, edad5)+ " alumnos mayores de edad /n");
        
        System.out.println("Ingrese las estaturas de los alumnos");
        float altura1 = alt1.nextFloat();
        float altura2 = alt2.nextFloat();
        float altura3 = alt3.nextFloat();
        float altura4 = alt4.nextFloat();
        float altura5 = alt5.nextFloat();
        System.out.println("El promedio de edades es de "+Alumno.promAltura(altura1, altura2, altura3, altura4, altura5));
        
    }
}
