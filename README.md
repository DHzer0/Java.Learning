# Java.Learning
package javaapplication9;
import java.util.Scanner;

/**
 *
 * @author DhZer0
 */
public class JavaApplication9 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int valor1,valor2;
        int soma=1;
        while(soma!=0){
        System.out.println("Digite o primeiro valor");
        valor1=entrada.nextInt();
        System.out.println("Digite o segundo valor");
        valor2=entrada.nextInt();
        
        soma=valor1+valor2;
        System.out.println("O valor da somas dos valores deu "+soma);
        System.out.println("   ");
        
        }
        
         
       
        
        
        
        
        
    }
    
}
