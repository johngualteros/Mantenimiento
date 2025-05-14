/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mantenimiento;

import java.util.ArrayList;
import java.util.Scanner;


public class Mantenimiento {
    static ArrayList<String> historial = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        String nombre = "";


        System.out.println("Bienvenido al sistema del grupo X");


        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar nombre y saludar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextLine();


            switch (opcion) {
                case "1":
                    System.out.print("Ingrese su nombre: ");
                    nombre = sc.nextLine();
                    String saludo = "Hola " + nombre + ", ¡bienvenido!";
                    System.out.println(saludo);
                    historial.add("Saludo: " + saludo);
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (!opcion.equals("4"));


        sc.close();
    }

}


