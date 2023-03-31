/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**
 *
 * @author vice1
 */
public class Usuario{
    private String correoElectronico;
    private String password;
    private String nombre;
    private String apellido;
    private float altura;
    private int peso; //Quizas pueda ser un float
    public int i = 0;
    char arroa = '@';
    File archivo = new File("L:/casosDePrueba.txt");
    public Usuario[] arregloUsuarios = new Usuario[100];
    Scanner entrada = new Scanner(System.in);
    Scanner datosEnArchivo = new Scanner(archivo);
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public void setApellido(String Apellido){
        this.apellido = Apellido;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setPeso(int Peso){
        this.peso = Peso;
    }
    
    
    
    public void crearUsuario() {
        arregloUsuarios[i] = new Usuario();
        System.out.println("Ingrese un correo electronico y una contraseña para crear tu cuenta");
        System.out.println("Correo electronico");
        String correo = entrada.nextLine();
        for ( int j = 0 ; i < correo.length() ; i++){
            if(correo.charAt(j) == arroa){
                System.out.println("El correo es valido");
                arregloUsuarios[i].correoElectronico = datosEnArchivo.nextLine();
                
            }
        }
        System.out.println("Contraseña");
        arregloUsuarios[i].password = entrada.nextLine();
        System.out.println("Ingresa tu nombre y tu apellido para que el resto pueda identificarte");
        System.out.println("Nombre");
        arregloUsuarios[i].nombre = entrada.nextLine();
        System.out.println("Apellido");
        arregloUsuarios[i].apellido = entrada.nextLine();
        i++;
    }
    
}
