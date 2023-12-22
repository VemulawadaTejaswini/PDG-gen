import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in;

    private static int n;
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int[][] mem;
    
	public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }

        mem = new int[n][4];

        for(int i=0; i<n; i++) Arrays.fill(mem[i], -1);

        System.out.println(solve(0, -1));
	}

    public static int solve(int i, int prev) {
        if (i==n) return 0;

        if (mem[i][prev+1]!=-1) return mem[i][prev+1];

        int ans = 0;

        if (prev!=0) {
            ans = Math.max(ans, a[i]+solve(i+1, 0));
        }
        if (prev!=1) {
            ans = Math.max(ans, b[i]+solve(i+1, 1));
        }
        if (prev!=2) {
            ans = Math.max(ans, c[i]+solve(i+1, 2));
        }

        return mem[i][prev+1] = ans;
    }

}
