import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String... args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] A = new int[N];
        String[] strA = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strA[i]);
        }
        Arrays.sort(A);
        label: for (int i = A[1]; 0 < i; i--) {
            int count = 0;
            for (int j =0; j < N; j++) {
                if (0 < A[j] % i && 1 < ++count) {
                    continue label;
                }
            }
            System.out.println(i);
            return;
        }
    }
}
