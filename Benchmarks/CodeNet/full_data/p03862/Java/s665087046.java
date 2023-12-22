import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, x;
        long[] a;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        x = in.nextInt();
        a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        long ans = solve(N, x, a);
        System.out.println(ans);
    }

    //a_i単体でxを超えていたらそこは絶対にいじる
    //a_i - (a_i - x) = x
    //1 6 1 2 0 4 (x=1)
    //1 1 1 1 0 1 (5+1+3で9回は絶対に操作する)
    //3 3 3 3 3 (x=1)
    //1 1 1 1 1 (2+2+2+2+2=10回は操作)
    //1 0 1 0 1 (10+2 = 12回が答え？)
    //3 5 3 1 3 6 2 (x=3)
    //3 3 3 1 3 3 2 (2+3=5回操作)
    //3 0 3 0 3 0 2 (3+1+3=7)
    //2 1 2 1 2 1 2 (1+2+1+1+2=7回)
    //1 2 1 1 2 1 2 (2+1+2+1+2=8回)
    //5 5 5 (x=0) -> 15
    //5 5 5 (x=1)
    //1 1 1 (4+4+4=12)
    //1 0 1 (12+1=13)
    //5 5 5 5 5
    //5 0 5 0 5
    //0 5 0 5 0
    //どっち?
    static long solve(int N, int x, long[] a) {
        long ans = 0;
        long[] b = Arrays.copyOf(a, a.length);
        for (int i = 0; i + 1 < N; i++) {
            b[i] = (b[i] > x ? x : b[i]);
            b[i + 1] = (b[i + 1] > x ? x : b[i + 1]);
            if (b[i] + b[i + 1] > x) {
                b[i + 1] = x - b[i];
            }
        }
        for (int i = 0; i < N; i++) {
            ans += a[i] - b[i];
        }
        return ans;
    }
}
