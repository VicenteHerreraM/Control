/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerarchivotexto;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author vice1
 */
public class LeerArchivoTexto {
    
    public static void main(String[] args) throws FileNotFoundException {
        File archivoTexto = new File("L:/pruebaTexto.txt");
        Scanner scan = new Scanner(archivoTexto);
        String correo = scan.nextLine();
        char arroa = '@';
        char punto = '.';
        
        
        for ( int i = 0 ; i < correo.length() ; i++){
            if(correo.charAt(i) == arroa){
                System.out.println("El correo es valido");
            }
        }
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
    }
}
