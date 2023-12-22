import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] a = new int[M];
            int[] b = new int[M];

            for (int i = 0; i < M; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }

            int[] count = new int[N + 1];
            for (int i = 0; i < M; i++) {
                count[a[i]]++;
                count[b[i]]++;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");

        }
    }
}
