import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }

        System.out.println(solve(N, L));
    }

    private static int solve(int N, int[] L) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    if (L[i] < L[j] + L[k] && L[j] < L[k] + L[i] && L[k] < L[i] + L[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}