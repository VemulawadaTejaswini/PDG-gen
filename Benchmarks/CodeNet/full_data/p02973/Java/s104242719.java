import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(reader.readLine());
            }

            int color = 0; // 色の数
            boolean[] B = new boolean[N]; // 塗る色が決まっているかどうか
            for (int i = N - 1; i >= 0; i--) {
                if (B[i]) {
                    continue;
                }

                color++;
                B[i] = true;

                int M = A[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (B[j]) {
                        continue;
                    }

                    if (A[j] < M) {
                        B[j] = true;
                        M = A[j];
                    }
                }
            }

            System.out.println(color);
        }
    }

}
