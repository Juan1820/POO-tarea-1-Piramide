/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author juanpablo
 */
public class Piramide2 {
    private int n;
    
    public void Numero(){
    Scanner dale = new Scanner(System.in);
        System.out.println("De cuantas filas quieres la piramide");
        n = dale.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
                 
            
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Piramide2 ejecutar = new Piramide2();
        ejecutar.Numero();
    }
    
}
