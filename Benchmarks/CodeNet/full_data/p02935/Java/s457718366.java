import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] v = new int[a];
        double sum = 0, max = 0;

        for (int i=0; i<a; i++) {
            v[i] = sc.nextInt();
        }


        for (int i=0; i<a; i++) {
            for (int j=0; j<a; j++) {
                sum += (v[i] + v[j]) / 2.0;

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.print(max);
    }
}