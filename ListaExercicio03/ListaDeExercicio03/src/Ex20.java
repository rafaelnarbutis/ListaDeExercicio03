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
public class Ex20 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        double primeiroNumero = scn.nextDouble();
        System.out.println("Digite o segundo numero");
        double segundoNumero = scn.nextDouble();
        
        
        boolean iguais = primeiroNumero == segundoNumero;
        boolean diferente = primeiroNumero != segundoNumero;
        boolean pMaior = primeiroNumero > segundoNumero;
        boolean sMaior = segundoNumero > primeiroNumero;
        boolean pNegativo = primeiroNumero < 0;
        boolean sNegativo = segundoNumero < 0;
        boolean resto = (primeiroNumero / segundoNumero) != 0 ;
        
        System.out.println("Os numeros são iguais: "+iguais);
        System.out.println("Os numeros são diferentes: "+diferente);
        System.out.println("O primeiro numero e maior que o segundo: "+pMaior);
        System.out.println("O segundo numero e maior que o primeiro: "+ sMaior);
        System.out.println("O primeiro numero é negativo: "+pNegativo);
        System.out.println("O segundo numero é negativo: "+sNegativo);
        System.out.println("A divisão entre o primeiro numero com o segundo teve resto: "+resto);
        
    }
    
    
}
