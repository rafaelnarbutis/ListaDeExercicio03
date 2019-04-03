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
public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o raio para saber a area");
        double raio = scn.nextDouble();
        double result = 3.14 * Math.pow(raio, 2);
        System.out.println("A area do circulo sera: "+ result);
               
    }
    
    
}
