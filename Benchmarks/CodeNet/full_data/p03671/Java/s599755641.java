import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(heights);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= N - K; i++) {
            int min = heights[i];
            int max = heights[i + K - 1];
            int diff = max - min;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
}
