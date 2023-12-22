import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N + 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int D = 0;
        for (int i = 0; i < x.length - 1; i++) {
            D = gcd(D, x[i + 1] - x[i]);
        }
        System.out.println(D);
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}