import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = stdIn.nextInt();
        }
        stdIn.close();
        float[] sum = new float[N - K + 1];
        float max = 0;
        for (int i = 0; i < N - K + 1; i++) {
            sum[i] = 0;
            for (int j = i; j < i + K; j++) {
                sum[i] += (p[j] + 1) * 0.5;
            }
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        System.out.println(max);
    }
}