/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividademontanha9;

import java.util.Scanner;

/**
 *
 * @author plush
 */
public class AtividadeMontanha9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        double c ;
        double F;
        
        System.out.println("Insira a temperatura em Fahrenheit: ");
        F = entrada.nextDouble();
        c = 5 * (F-32) / 9;
        System.out.println("A conversao para celsius e " + c);
        
        
    }
    
}
