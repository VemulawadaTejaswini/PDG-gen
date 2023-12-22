import java.util.*;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int K = 0;
        String[] num = scanner.nextLine().split(" ");
        N = Integer.parseInt(num[0]);
        K = Integer.parseInt(num[1]);
        String[] p = scanner.nextLine().split(" ");
        double maxExpected = 0;
        for(int x = 0; x<N; x++){
            maxExpected = Math.max(maxExpected, getExpected(K,x, N, p));
        }
        System.out.println(maxExpected);


    }

    public static double getExpected(int k, int x, int N, String[] p){
        double expected = 0;
        double val = 0;
        for(int y = x; y<x+k && y<N; y++){
            val = (double) Integer.parseInt(p[y]);
            expected = expected + ge(val);
        }
        return expected;
    }

    public static double ge(double n){
        double g = 0;
        for(double x = 1; x<=n; x++){
            g = g + x*1/n;
        }
        return g;
    }

}
