/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Calculadora {

      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = soma(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
    }
    
        public static int soma(int a, int b) {
        return a + b;
    }
    
    
      
}