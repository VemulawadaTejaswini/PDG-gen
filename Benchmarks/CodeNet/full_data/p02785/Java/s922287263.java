import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();

        final int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        Arrays.sort(H);

        for (int i = 1; i <= K && N-i >= 0; i++) {
            H[N-i] = 0;
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += H[i];
        }

        System.out.println(ans);
    }
}
