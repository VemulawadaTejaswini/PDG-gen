import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int N;
    private static int M;
    private static int[] X;

    static {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        Arrays.sort(X);

        int[] l = new int[M - 1];
        for (int i = 0; i < M - 1; i++) {
            l[i] = X[i + 1] - X[i];
        }
        Arrays.sort(l);

        int sum = 0;
        for (int i = 0; i < M - N; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
