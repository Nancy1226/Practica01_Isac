package com.upchiapa.Practica01.models;
import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {
    private ArrayList<Numero> listaNumero=new ArrayList<Numero>();
    Scanner teclado = new Scanner(System.in);

    public int validarNumero(int valor){
        while (valor <0) {
            System.out.println("Numero no valido");
            System.out.println("ingrese de nuevo");
            valor = teclado.nextInt();
        }
        return valor;
    }

    public void agregar(int n1){
        listaNumero.add(new Numero(n1));
        System.out.println("\nNumero agregado");
    }


    public void sumar(){
        int suma=0;
        for (Numero numero : listaNumero) {
            suma+=numero.getNumero();
        }
        System.out.println("La suma es: "+suma);
     listaNumero=new ArrayList<>();
    }

}
