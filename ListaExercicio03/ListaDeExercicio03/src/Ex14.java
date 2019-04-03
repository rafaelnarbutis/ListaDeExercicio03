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
public class Ex14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Digite o valor primeira base do trapezio");
        double primeiraBase = scn.nextDouble();
        System.out.println("Digite o valor da segunda base do trapezio");
        double segundaBase = scn.nextDouble();
        System.out.println("Digite a altura do trapezio");
        double altura = scn.nextDouble();
        double result = ((primeiraBase + segundaBase) * altura)/2;
        System.out.println("A area do trapezio: "+result+"cm²");
    }
    
    
}
