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
public class Ex19 {
    
    
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        double primeiroNumero = scn.nextDouble();
        System.out.println("Digite o segundo numero");
        double segundoNumeor = scn.nextDouble();
        
        boolean result = primeiroNumero >= segundoNumeor;
        System.out.println("O primeiro numero e maior ou igual ao segundo? "+result);
        
        
        
    }
    
}
