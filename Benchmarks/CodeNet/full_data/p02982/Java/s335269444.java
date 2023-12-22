import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int D = in.nextInt();
        double[][] arr = new double[N][D];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < D; ++j) {
                arr[i][j] = in.nextDouble();
            }
        }

        int ans = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < i; ++j) {
                if (integerDistance(arr[i], arr[j])) 
                    ++ans;
            }
        }

        System.out.println(ans);
    }

    private static boolean integerDistance(double[] a, double[] b) {
        // a & b guaranteed to have same length
        double dist = 0;
        for (int i = 0; i < a.length && i < b.length; ++i) {
            dist += sq(a[i] - b[i]);
        }
        return isInteger(dist);
    }

    private static boolean isInteger(double d) {
        double sqrt = Math.floor(Math.sqrt(d));
        return sqrt * sqrt == d;
    }

    private static double sq(double a) {
        return a * a;
    }
}