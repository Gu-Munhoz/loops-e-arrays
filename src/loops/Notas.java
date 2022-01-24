package loops;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo ate um valor valido ser inserído.
*/

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Nota: ");
            nota = scan.nextInt();
            if (nota > 10)break;

        }
        System.out.println("Nota invalida!");
    }
}
