/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matrícula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
    */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
     String nombres;
     String ciudadNacimiento;
     int edad;
     double matricula;
     
     System.out.println("Ingrese sus nombres");
     nombres = entrada.nextLine();
     System.out.println("Ingrese su ciudad de nacimiento");
     ciudadNacimiento = entrada.nextLine();
     System.out.println("Ingrese su edad");
     edad = entrada.nextInt(); // ingreso de enteros
     System.out.println("Ingrese su valor de matrícula");
     matricula = entrada.nextDouble(); // ingreso de decimales
     
     System.out.printf("Datos Personales:\nNombres:%s\nCiudad de Nacimiento:%s"
             + "\nEdad:%d\nMatricula:%.2f\n", nombres, ciudadNacimiento, edad,
             matricula);
}
}