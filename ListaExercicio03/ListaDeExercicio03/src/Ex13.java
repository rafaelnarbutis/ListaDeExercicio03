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
public class Ex13 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a primeira nota do primeiro bimestre");
        double primeiroBPNota = scn.nextDouble();
        System.out.println("Digite a segunda nota do primeiro bimestre");
        double primeiroBSNota = scn.nextDouble();
        double resultPB = ((primeiroBPNota * 2)+(primeiroBSNota * 3))/5;
        System.out.println("Digite a primeira nota do segundo bimestre");
        double segundoBPNota = scn.nextDouble();
        System.out.println("Digite a segunda nota do segundo bimestre");
        double segundoBSNota = scn.nextDouble();
        double resultSB = ((segundoBPNota * 2)+(segundoBSNota * 3))/5;
        double resultSemestre = resultPB + resultSB;
        System.out.println("O resultado do semestre foi: "+resultSemestre);
        
        
    }
    
    
}
