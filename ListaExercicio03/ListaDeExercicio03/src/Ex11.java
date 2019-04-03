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
public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        double primeiroValor = scn.nextDouble();
        System.out.println("Digite o segundo valor");
        double segundoValor = scn.nextDouble();
        
        double resultSoma = primeiroValor + segundoValor;
        double resultDiferenca = primeiroValor - segundoValor;
        double resultProduto = primeiroValor * segundoValor;
        double resultQuociente = primeiroValor / segundoValor;
        double resultResto = primeiroValor % segundoValor;
        
        
        System.out.println("Soma: "+resultSoma);
        System.out.println("Diferença: "+resultDiferenca);
        System.out.println("Produto: "+resultProduto);
        System.out.println("Quociente: "+resultQuociente);
        System.out.println("Resto: "+resultResto);
        
        
    }
    
    
}
