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
public class Ex10 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int valorA = scn.nextInt();
        System.out.println("Digite o valor de B");
        int valorB = scn.nextInt();
        int armazenaValorA = valorA;
        valorA = valorB;
        valorB = armazenaValorA;
        System.out.println("Valor A: "+valorA);
        System.out.println("Valor B: "+valorB);
        
        
    }
    
}
