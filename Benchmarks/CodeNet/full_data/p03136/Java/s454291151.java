import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = in.nextInt();
            }

            int sum = 0;
            int max = 0;
            for (int i = 0; i < N; i++) {
                sum += L[i];
                max = Math.max(max, L[i]);
            }
            sum -= max;

            System.out.println(sum > max ? "Yes" : "No");
        }
    }
}
