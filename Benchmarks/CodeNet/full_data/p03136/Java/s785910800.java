import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] L;
        int max;
        int sum = 0;

        L = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(L[i]);
        }
        Arrays.sort(L);

        max = Integer.parseInt(L[L.length - 1]);

        if (max < (sum - max)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}