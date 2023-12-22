import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);

            array = reader.readLine().split(" ");
            long[] A = new long[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(array[i]);
                sum += A[i];
            }

            for (int i = 0; i < M; i++) {
                long max = -1;
                int max_index = -1;

                for (int j = 0; j < N; j++) {
                    if (max < A[j]) {
                        max = A[j];
                        max_index = j;
                    }
                }

                sum = sum - max + (max / 2);
                A[max_index] = (max / 2);
            }

            System.out.println(sum);
        }
    }

}
