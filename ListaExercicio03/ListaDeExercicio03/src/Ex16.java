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
public class Ex16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite uma senha");
        String senha = scn.nextLine();
        System.out.println("Redigite a sua senha");
        String senhaRepet = scn.nextLine();
        
        boolean senhaCerta = senha.equals(senhaRepet);
        System.out.println("Senhas iguais: "+senhaCerta);
    }
    
    
}
