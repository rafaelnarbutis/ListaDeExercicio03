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
public class Ex09 {
    
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
        
        
        System.out.println("Primeiro inteiro: "+primeiroInteiro+";"+" Segundo inteiro: "+segundoInteiro+";"+
                " Primeiro decimal: "+primeiroDecimal+";"+" Segundo decimal: "+segundoDecimal+";"+
                " Primeiro texto: "+primeiroTexto+";"+" Segundo texto: "+segundoTexto);
        
        
    }
   
        
    
    
}
