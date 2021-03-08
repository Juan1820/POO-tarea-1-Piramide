/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juanpablo
 */
public class NumerosOrdenados {
    private int n;
    private int num[];
    
    public void entrada(){
    Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros desea insertar para ordenarlos");
        n = leer.nextInt();
        
        num = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Introdusca un numero a ordenar");
            num [i] = leer.nextInt();
            
        }
        System.out.print(Arrays.toString(num));
    }
    
    public void Operacion(){
        
    }
    
    public static void main(String[] args) {
        NumerosOrdenados ejecutar = new NumerosOrdenados();
        ejecutar.entrada();
    }
    
}
