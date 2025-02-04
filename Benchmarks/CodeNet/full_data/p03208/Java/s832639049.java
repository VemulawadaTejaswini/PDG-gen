import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < N - K + 1; i++) {
            minDiff = Math.min(minDiff, list[i + K - 1] - list[i]);
        }

        System.out.println(minDiff);
    }
}