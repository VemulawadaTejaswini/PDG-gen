import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += a[i];
            }

            int mean = sum / N;

            int min = (int) 1e9;
            min = Math.min(min, sumDiff(N, a, mean));
            min = Math.min(min, sumDiff(N, a, mean + 1));

            System.out.println(min);
        }
    }

    private static int sumDiff(int N, int[] a, int mean) {
        int sumDiff = 0;
        for (int i = 0; i < N; i++) {
            sumDiff += (a[i] - mean) * (a[i] - mean);
        }
        return sumDiff;
    }
}
