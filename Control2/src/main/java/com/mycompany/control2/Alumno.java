/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control2;

/**
 *
 * @author vice1
 */
public class Alumno {
    private String Nombre;
    private char Rut;
    private String Mail;
    private float [] CantNotas = new float[20];
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getMail(){
        return Mail;
    }
    
    public char getRut(){
        return Rut;
    }
    
    public float[] getCantNotas(){
        return CantNotas;
    }
    
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setRut(char Rut){
        this.Rut = Rut;
    }
    
    public void setMail(String Mail){
        this.Mail = Mail;
    }
    
    public void setCantNotas(float []CantNotas){
        this.CantNotas= CantNotas;
    }
    
    public float calcularPromedio(float [] notas){
        float sumaNotas = 0;
        float prom;
        for(int i = 0 ; i < notas.length ; i++){
            if(notas[i] >= 1.0){
                sumaNotas+= notas[i];
        }        
    }
    prom = sumaNotas / notas.length;

    return prom;
    }
}
