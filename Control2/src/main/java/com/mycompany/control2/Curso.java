/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control2;

/**
 *
 * @author vice1
 */
public class Curso {
    private char Letra;
    private int Id;
    private int CantAlumnos;
    private Alumno AlumnosCurso[] = new Alumno[27];
    
    
    public int getId(){
        return Id;
    }
    
    public char getLetra(){
        return Letra;
    }
    
    public int getCantAlumnos(){
        return CantAlumnos;
    }
    
    public Alumno[] getAlumnosCurso(){
        return AlumnosCurso;
    }
    
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public void setLetra(char Letra){
        this.Letra = Letra;
    }
    
    public void setCantAlumnos(int CantAlumnos){
        this.CantAlumnos = CantAlumnos;
    }
    
    public void setAlumnosCurso(Alumno AlumnosCurso[]){
        this.AlumnosCurso= AlumnosCurso;
    }
    
    
    public Alumno menorPromedio(){
        Alumno menorProm = null;
        float prom;
        float menorNota = 0;
        for (int i = 0 ; i < AlumnosCurso.length ; i++){
            prom = AlumnosCurso[i].calcularPromedio(AlumnosCurso[i].getCantNotas());
            if(prom < menorNota){
                AlumnosCurso[i] = menorProm;
            }
        }
        return menorProm;
    }

}
