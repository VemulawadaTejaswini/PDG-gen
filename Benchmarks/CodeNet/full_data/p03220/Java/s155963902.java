import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int T = cin.nextInt();
        int A = cin.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = cin.nextInt();
        }

        int min = abs(A - (int)(T - H[0] * 0.006));
        int idx = 0;
        for (int i = 1; i < N; i++) {
            int a = (int) (T - H[i] * 0.006);
            int m = abs(A - a);
            if (min >= m) {
                min = m;
                idx = i;
            }
        }
        System.out.println(idx + 1);
    }
}