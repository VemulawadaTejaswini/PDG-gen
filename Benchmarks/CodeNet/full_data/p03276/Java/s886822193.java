import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int n,k;
    static int[] x;

    static int h, w, d;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < n-k+1; i++) {
            int l = x[i];
            int r = x[i + k - 1];
            if(l < 0) {
                if(r <= 0) {
                    ans = Math.min(ans, Math.abs(l));
                }else{
                    ans = Math.min(ans, 2*r + Math.abs(l));
                    ans = Math.min(ans, 2*Math.abs(l)+r);
                }
            }else{
                ans = Math.min(ans, r);
            }
        }

        print(ans);
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(char c) {
        System.out.println(c);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }

    static void printArray2D(int[][] array, char del) {
        int r = array.length;
        int c = array[0].length;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.format("%3d", array[i][j]);
                if(j != c-1) System.out.print(del);
                else System.out.print('\n');
            }
        }
    }
}
