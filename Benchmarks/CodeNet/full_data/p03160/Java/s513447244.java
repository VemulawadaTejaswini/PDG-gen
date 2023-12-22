import java.util.*;
import java.util.Arrays;

public class Main {
    public static long a = (long)Math.pow(2, 60);
    public static long[] lst;
    public static long[] height;
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        //System.out.println(a);
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        lst = new long[N];
        
        Arrays.fill(lst, a);
        
        //System.out.println(lst[0]);
        
        height = new long[N];
        
        for (int i=0; i<N; i++) {
            height[i] = sc.nextInt();
        }
        
        //System.out.println(height[1]);
        
        System.out.println(tilAns(N));
    }
    static long tilAns(int n){
        if (lst[n-1] != a) {
            return lst[n-1];
        }
        
        if (n == 1) {
            lst[0] = 0;
            return 0;
        }
        
        if (n == 2) {
            lst[1] = tilAns(1) + Math.abs(height[1] - height[0]);
            return lst[1];
        }
        
        lst[n-1] = Math.min(tilAns(n-2) + Math.abs(height[n-1] - height[n-3]), tilAns(n-1) + Math.abs(height[n-1] - height[n-2]));
        return lst[n-1];
    }
}
