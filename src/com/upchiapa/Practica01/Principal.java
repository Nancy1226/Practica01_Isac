package com.upchiapa.Practica01;
import com.upchiapa.Practica01.models.Validaciones;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Validaciones validaciones=new Validaciones();
        int n1,opcion;
            do {
            System.out.println("Seleccione la opcion deseada");
            System.out.println("---1_Agregar numero a la lista");
            System.out.println("---2.Sumar");
            System.out.println("---3.Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    n1 = teclado.nextInt();
                    n1 = validaciones.validarNumero(n1);
                    validaciones.agregar(n1);
                    break;
                case 2:
                    validaciones.sumar();
                    break;
                case 3:
                    System.out.println("bye");
                    break;
            }
        }while (opcion!=3);
    }
}
