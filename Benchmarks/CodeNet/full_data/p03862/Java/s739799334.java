import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            long count = 0;
            for (int i = 0; i + 1 < N; i++) {
                if (a[i] + a[i + 1] > x) {
                    int c = (a[i] + a[i + 1]) - x;
                    count += c;
                    a[i + 1] -= c;
                    if (a[i + 1] < 0) {
                        a[i] += a[i + 1];
                        a[i + 1] = 0;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
