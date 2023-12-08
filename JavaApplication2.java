/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Dhaniel
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner scanner= new Scanner (System.in);
         System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();
         System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();
        int soma=valor1+valor2;
        System.out.println("A soma dos valores é "+soma);
        if(soma<100){
            System.out.print("o valor da soma é menor que 100 por "+ ( 100-soma ) );
        
        }
        if(soma>100){ System.out.print("o valor da soma é maior que 100 por "+ ( soma-100 ) );}
        
        
        
        
        
        
        
    }
    
}
