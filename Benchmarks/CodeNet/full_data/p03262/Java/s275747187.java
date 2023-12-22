import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] dist = new int[N];

        for (int i = 0; i < N; i++) {
            dist[i] = Math.abs(sc.nextInt() - X);
        }

        int gcd = dist[0];
        for (int i = 1; i < N; i++) {
            if (gcd > dist[i]) {
                gcd = gcd(gcd, dist[i]);
            } else {
                gcd = gcd(dist[i], gcd);
            }
        }

        System.out.println(gcd);
    }

    static int gcd(int a, int b) {
        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}