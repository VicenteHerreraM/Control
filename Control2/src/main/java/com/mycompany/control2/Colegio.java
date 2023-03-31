/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control2;

/**
 *
 * @author vice1
 */
public class Colegio {
    private String NombreColegio;
    private String NombreDirector;
    private Curso CursosTotales [] = new Curso[24];
    
    public String getNombreColegio(){
        return NombreColegio;
    }
    
    public String getNombreDirector(){
        return NombreDirector;
    }
    
    public Curso [] getCursosTotales(){
        return CursosTotales;
    }
    
    public void setNombreColegio(String NombreColegio){
        this.NombreColegio= NombreColegio;
    }
    
    public void setNombreDirector(String NombreDirector){
        this.NombreDirector= NombreDirector;
    }
    
    public void setCursosTotales(Curso CursosTotales []){
        this.CursosTotales = CursosTotales;
    }
    
    Alumno [] cursosConAlumnosMenorPromedio(){
        
        Alumno alumnosMenorNotas [] = new Alumno[20];
        for(int i = 0 ; i < CursosTotales.length ; i++){
            for (int j = 0 ; j < alumnosMenorNotas.length ; i++){
                alumnosMenorNotas[j] = CursosTotales[i].menorPromedio();
            }
        }
        
    }
}
