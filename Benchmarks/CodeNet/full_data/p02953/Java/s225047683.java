import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String[] array = reader.readLine().split(" ");
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = Integer.parseInt(array[i]);
            }

            boolean ret = true;

            for (int i = N - 1; i > 0; i--) {
                if (H[i] <= H[i - 1] - 2) {
                    ret = false;
                    break;
                }

                if (H[i] == H[i - 1] - 1) {
                    H[i - 1]--;
                }
            }

            System.out.println(ret ? "Yes" : "No");
        }
    }

}
