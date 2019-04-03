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
public class Ex17 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numeor pra saber se ele e negativo ou positivo");
        double numero = scn.nextDouble();
        boolean result = numero > 0;
        System.out.println("O numero é Positivo? "+result);
        
        
    }
    
    
}
