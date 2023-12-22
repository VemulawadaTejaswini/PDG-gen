import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.valueOf(input[0]);
        int K = Integer.valueOf(input[1]);

        int sum = 0;
        int min = 0;
        for (int i = 0; i < K - 1; i ++) {
            min += i;
        }
        int max = 0;
        for (int i = N; i > N - K + 1; i --) {
            max += i;
        }


        for (int i = K - 1; i < N + 1; i ++) {
            min += i;
            max += N - i;
            sum += (max - min + 1);
        }

        System.out.println(sum);
    }
}