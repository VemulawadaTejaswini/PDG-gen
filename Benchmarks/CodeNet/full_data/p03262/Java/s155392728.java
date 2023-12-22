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
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        x[n] = X;
        
        Arrays.sort(x);
        
        int imin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (x[i + 1] - x[i] < imin) {
                imin = x[i + 1] - x[i];
            }
        }
        
        int j = 0;
        boolean isgcd = false;
        while(j <= imin - 1) {
            for (int i = 0; i < n; i++) {
                if ((x[i + 1] - x[i]) % (imin - j) != 0) {
                    break;
                }
                isgcd = true;
            }
            if (isgcd) break;
            j++;
        }
        System.out.println(imin - j);
    }
}
