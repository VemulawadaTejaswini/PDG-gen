import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];

        for(int i=0; i<n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        int[] xs = {1, 1, 1, 1, -1, -1, -1, -1};
        int[] ys = {1, 1, -1, -1, 1, 1, -1, -1};
        int[] zs = {1, -1, 1, -1, 1, -1, 1, -1};

        long res = 0;
        for(int j=0; j<8; j++) {
            long[] a = new long[n];
            for(int i=0; i<n; i++) {
                a[i] = x[i] * xs[j] + y[i] * ys[j] + z[i] * zs[j];
            }
            Arrays.sort(a);
            long sum = 0;
            for(int i=n-1; i>n-1-m; i--) {
                sum += a[i];
            }
            res = Math.max(res, sum);
        }

        System.out.println(res);
    }

}
