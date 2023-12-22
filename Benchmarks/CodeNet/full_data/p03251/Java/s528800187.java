import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] x = new int[N+1];
        int[] y = new int[M+1];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        x[N] = X;

        for (int i = 0; i < M; i++) {
            y[i] = sc.nextInt();
        }
        y[M] = Y;

        Arrays.sort(x);
        Arrays.sort(y);

        if (x[x.length - 1] < y[0]) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}