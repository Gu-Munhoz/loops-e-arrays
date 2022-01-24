package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNum;
        int num;
        int count = 0;
        int qtdPares = 0 , qtdImpares = 0;

        System.out.println("Quantidade de numeros: ");
        qtdNum = scan.nextInt();

        do{
            System.out.println( "Número: ");
            num = scan.nextInt();

            if(num % 2 == 0) qtdPares++;
            else qtdImpares++;

            count++;
        }while(count < qtdNum);

        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidade ímpares: " + qtdImpares);
    }

}
