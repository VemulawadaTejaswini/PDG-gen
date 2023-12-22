import java.util.*;
import java.lang.*;

public class Main{
    
    static int n;
    static int X;
    static int[] x;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        X = sc.nextInt();
        x = new int[n + 1];
        int[] interval = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        x[n] = X;
        
        Arrays.sort(x);
        
        int imin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            interval[i] = x[i + 1] - x[i];
            if (interval[i] < imin) {
                imin = interval[i];
            }
        }
        
        int j = 0;
        boolean isgcd = false;
        while(j <= imin - 1) {
            for (int i = 0; i < n; i++) {
                if (interval[i] % (imin - j) != 0) {
                    break;
                }
                if (i == n - 1) {
                    isgcd = true;
                }
            }
            if (isgcd) break;
            j++;
        }
        System.out.println(imin - j);
    }
}