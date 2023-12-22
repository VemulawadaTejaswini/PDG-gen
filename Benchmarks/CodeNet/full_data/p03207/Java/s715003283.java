import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] price = new int[NUM];
        for(int i = 0; i < NUM; i++){
            price[i] = scan.nextInt();
        }

        // sort
        Arrays.sort(price);

        // calc
        int sum = price[NUM - 1] / 2;
        for(int i = 0; i < NUM - 1; i++){
            sum += price[i];
        }

        // answer
        System.out.println(sum);

    }
}