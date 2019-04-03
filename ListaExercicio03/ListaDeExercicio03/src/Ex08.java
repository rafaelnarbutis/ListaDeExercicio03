/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael.fnarbutis
 */
import java.util.Scanner;
public class Ex08 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro");
        int primeiroInteiro = scn.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int segundoInteiro = scn.nextInt();
        System.out.println("Digite o primeiro numero decimal");
        double primeiroDecimal = scn.nextDouble();
        System.out.println("Digite o segundo numero decimal");
        double segundoDecimal = scn.nextDouble();scn.nextLine();
        System.out.println("Digite o primeiro texto");
        String primeiroTexto = scn.nextLine();
        System.out.println("Digite o segundo texto");
        String segundoTexto = scn.nextLine();
        
        
        System.out.println("Primeiro inteiro: "+primeiroInteiro);
        System.out.println("Segundo inteiro: "+segundoInteiro);
        System.out.println("Primeiro decimal: "+primeiroDecimal);
        System.out.println("Segundo decimal: "+segundoDecimal);
        System.out.println("Primeiro texto: "+primeiroTexto);
        System.out.println("Segundo texto: "+segundoTexto);
        
        
        
    }
    
    
    
}
