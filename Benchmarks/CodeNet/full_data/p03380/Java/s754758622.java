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
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] solve(int N, int[] a) {
        int[] ans = new int[2];
        int max = 0;
        int mid = -1;

        for (int i=0; i<N; i++) {
            max = Math.max(max, a[i]);
        }

        for (int i=0; i<N; i++) {
            if (a[i] == max) continue;
            if (mid == -1) mid = a[i];


            if ( Math.abs(0.5 - (double)mid/max) > Math.abs(0.5 - (double) a[i]/max)) {
                mid = a[i];
            }
        }
        ans[0] = max;
        ans[1] = mid;

        return ans;
    }
}
