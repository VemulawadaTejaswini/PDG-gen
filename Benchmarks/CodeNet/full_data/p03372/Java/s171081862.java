import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int n = sc.nextInt();
                long c = sc.nextLong();
                long[] xs = new long[n];
                long[] vs = new long[n];
                for(int i = 0; i < n; i++){
                    xs[i] = sc.nextLong();
                    vs[i] = sc.nextLong();
                }
                
                // ---0===|
                long[] max_l = new long[n+1];//leftにi番目まで見たときのmax
                long[] max_l2 = new long[n+1];//行って戻ってくる
                long sum_l = 0;
                max_l[0] = 0;
                max_l2[0] = 0;
                for(int i = 0; i < n; i++){
                    sum_l += vs[i];
                    max_l[i+1] = (max_l[i] > sum_l - xs[i])? max_l[i]: sum_l - xs[i];
                    max_l2[i+1] = (max_l2[i] > sum_l - xs[i]*2)? max_l[i]: sum_l - xs[i]*2;
                }
                // |===0---
                long[] max_r = new long[n+1];
                long[] max_r2 = new long[n+1];
                long sum_r = 0;
                max_r[0] = 0;
                max_r2[0] = 0;
                for(int i = 0; i < n; i++){
                    sum_r += vs[n-1-i];
                    max_r[i+1] = (max_r[i] > sum_r - c + xs[n-1-i])? max_r[i]: sum_r - sum_r - c + xs[n-1-i];
                    max_r2[i+1] = (max_r2[i] > sum_r - (c-xs[n-1-i])*2)? max_r[i]: sum_r - (c-xs[n-1-i])*2;
                }
                long max = 0;
                for(int i=0; i<n; i++){
                    max = (max > max_l[i]+max_r2[n-1-i])? max: max_l[i]+max_r2[n-1-i];
                    max = (max > max_r[i]+max_l2[n-1-i])? max: max_r[i]+max_l2[n-1-i];
                }
                
                System.out.println(max);
            }
        }
    }
}