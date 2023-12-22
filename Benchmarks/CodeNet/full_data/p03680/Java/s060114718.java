import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(N, a));
    }

    private static int solve(int N, int[] a) {
        int current = 1;
        for (int i=0; i<N; i++) {
            current = a[current-1];

            if (current == 2) return i+1;
        }

        return -1;
    }
}