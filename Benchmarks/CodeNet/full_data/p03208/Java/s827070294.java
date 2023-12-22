import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {
        
        int ans = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        
        int min = Integer.MAX_VALUE;
        
        //System.out.println("---");
        
        for (int i = k-1; i < n; i++) {
            if (min > h[i] - h[i - (k - 1)]) {
                min = h[i] - h[i - (k - 1)];
                //System.out.println(min);
            }
        }
        
        ans = min;
        
        System.out.println("ans: " + ans);
    }
}