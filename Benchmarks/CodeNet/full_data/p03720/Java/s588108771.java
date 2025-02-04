import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] a = new int[M];
            int[] b = new int[M];
            for (int i = 0; i < M; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
            }

            int[] count = new int[N];
            for (int i = 0; i < M; i++) {
                count[a[i]]++;
                count[b[i]]++;
            }

            for (int i = 0; i < N; i++) {
                System.out.println(count[i]);
            }
        }
    }
}
