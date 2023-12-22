import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] P = new int[N];
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            int nextInt = in.nextInt();
            P[i] = nextInt;
            R[nextInt - 1] = i;
        }

        // R < N <= 20,000
        int X = 30000;

        int a[] = new int[N];
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = (i + 1) * X;
            b[i] = (N - i) * X + R[i];
        }
        for (int ai : a) {
            System.out.print(ai + " ");
        }
        System.out.println();
        for (int bi : b) {
            System.out.print(bi + " ");
        }
        System.out.println();
    }
}