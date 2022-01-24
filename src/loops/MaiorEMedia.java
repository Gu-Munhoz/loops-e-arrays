package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            num = scan.nextInt();

            soma += num;


            if (num > maior) maior = num;

            ++count;
        } while (count < 5);

        System.out.println("O maior numero é: " + maior);
        System.out.println("A media é: " + soma/5 );

    }
}
