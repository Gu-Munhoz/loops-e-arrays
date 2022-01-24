package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 10, 20, -8, 6};
        int count =0;

        while(count < vetor.length -1){
            //System.out.println(vetor[count]);
            //count++;
        }

        for(int i = vetor.length - 1; i >= 0 ;i--){
            System.out.println(vetor[i]);
        }
    }

}
