import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] B = new int[N + 1];
        for (int i = 1; i < N; i++) {
            B[i] = scan.nextInt();
        }
        B[0] = Integer.MAX_VALUE;
        B[N] = Integer.MAX_VALUE;
        scan.close();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.min(B[i], B[i + 1]);
        }
        int ans = Arrays.stream(A).sum();
        System.out.println(ans);
    }
}