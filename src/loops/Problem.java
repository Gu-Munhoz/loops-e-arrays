package loops;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int k;

        k = scan.nextInt();

        if (k == 1) {
            System.out.println("Top " + 1);

        }else if (k <=3){
            System.out.println("Top " + 3);

        }else if (k <= 5){
            System.out.println("Top " + 5);

        }else if (k <= 10){
            System.out.println("Top " + 10);

        }else if (k <= 25){
            System.out.println("Top " + 25);

        } else if (k <= 50) {
            System.out.println("Top " + 50);

        }else if (k <= 100){
            System.out.println("Top " + 100);
        }

    }
}