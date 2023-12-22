import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        if (input.length == 1) {
            System.out.println(Math.abs(x - input[0]));
            return;
        }
        for (int i = 1; i < n; i++) {
            int temp = Math.abs(x - input[i]);
            int temp2 = Math.abs(x - input[i - 1]);
            int gcd = gcd(temp, temp2);
            if (gcd < max)
                max = gcd;
        }
        System.out.println(max);
    }
}