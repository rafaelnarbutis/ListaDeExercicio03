/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */

import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um valor para saber a o quadrado e a raiz");
        double valor = scn.nextDouble();
        double resultQuadrado = Math.pow(valor, 2);
        double resultRaiz = Math.sqrt(valor);
        System.out.println("Quadrado: "+resultQuadrado);
        System.out.println("Raiz: "+resultRaiz);
        
        
    }
    
    
}
