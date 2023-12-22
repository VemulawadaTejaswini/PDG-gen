import java.util.*;
import java.util.Arrays;

public class Main {
    public static long a = (long)Math.pow(2, 60);
    public static long[] lst;
    public static long[] height;
    public static int K;
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        //System.out.println(a);
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();
        
        lst = new long[N];
        
        Arrays.fill(lst, a);
        
        lst[0] = 0;
        
        //System.out.println(lst[0]);
        
        height = new long[N];
        
        for (int i=0; i<N; i++) {
            height[i] = sc.nextInt();
        }
        
        //System.out.println(height[1]);
        
        //System.out.println(tilAns(N));
        System.out.println(tilAns(N-1));
    }
    static long tilAns(int n){
        if (lst[n] != a) {
            return lst[n];
        }
        
        if (n < K) {
            long mini = a;
            for (int i = 0; i<n; i++){
                if (mini > tilAns(i) + Math.abs(height[n] - height[i])) {
                    mini = tilAns(i) + Math.abs(height[n] - height[i]);
                }
            }
            lst[n] = mini;
            return lst[n];
        }
        long mini = a;
        for (int i = 1; i<=K; i++){
            if (mini > tilAns(n-i) + Math.abs(height[n] - height[n-i])) {
                mini = tilAns(n-i) + Math.abs(height[n] - height[n-i]);
            }
            
        }
        lst[n] = mini;
        return lst[n];
    }
}
