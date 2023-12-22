import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long K = Long.parseLong(scanner.next());
        int Q = Integer.parseInt(scanner.next());

        int[] A = new int[Q];

        for (int i = 0; i < Q; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        long[] points = new long[N];
        Arrays.fill(points, K);

        // 答えを処理していく
        for (int i = 0; i < Q; i++) {
            // 正解した人以外が-1ポインツ (1始まりなので-1)
            int correctIndex = A[i] - 1;
            for (int j = 0; j < N; j++) {
                if (j == correctIndex) continue;
                points[j]--;
            }
        }

        // 0ポイント以下は敗退
        for (int i = 0; i < N; i++) {
            System.out.println(points[i] >= 1 ? "Yes" : "No");
        }
    }
}
