import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = solve(N, a);

        for (int i=0; i<N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] solve(int N, int[] a) {
        int[] ans = new int[N];
        int total = Math.abs(a[0]) + Math.abs(a[N-1]);

        for (int i=0; i<N-1; i++) {
            total += Math.abs(a[i+1] - a[i]);
        }

        for (int i=0; i<N; i++) {
            ans[i] = total;

            if (i == 0) {
                ans[i] = total - Math.abs(a[i] - 0) - Math.abs(a[i] - a[i+1]) + Math.abs(a[i+1] - 0);
            } else if (i == N-1) {
                ans[i] = total - Math.abs(a[i] - 0) - Math.abs(a[i] - a[i-1]) + Math.abs(a[i-1] - 0);
            } else {
                ans[i] = total - Math.abs(a[i] - a[i-1]) - Math.abs(a[i] - a[i+1]) + Math.abs(a[i+1] - a[i-1]);
            }
        }

        return ans;
    }
}