package arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numRandom = new int[20];

        for(int i = 0; i < numRandom.length; i++){
            int num = random.nextInt(100);
            numRandom[i] = num;
        }

        System.out.print("Números Aleatorios: ");
        for (int num : numRandom ) {
            System.out.print(num + " ");
        }

        System.out.print("\nSucessores dos Numeros aleatorios: ");
        for (int num : numRandom){
            System.out.print((num + 1) + " ");

        }

    }
}
