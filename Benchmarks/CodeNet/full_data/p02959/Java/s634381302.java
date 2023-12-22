import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] a = new long[N + 1];
        for (int i = 0; i < N + 1; i++) {
            a[i] = scanner.nextLong();
        }
        long[] b = new long[N];
        for (int i = 0; i < N; i++) {
            b[i] = scanner.nextLong();
        }

        long result = 0;
        for (int i = 0; i < N; i++) {
            long broken = Math.min(a[i], b[i]);
            result += broken;
            broken = Math.min(a[i + 1], b[i] - broken);
            result += broken;
            a[i + 1] = b[i] - broken;
        }
        System.out.println(result);
    }
}