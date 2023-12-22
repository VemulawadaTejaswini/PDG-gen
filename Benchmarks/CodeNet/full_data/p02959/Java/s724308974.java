import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        
        long[] ar = reverse(a);
        long[] br = reverse(b);
        
        long sum1 = 0, residue = 0, ability;
        
        for (int i = 0; i < n + 1; i++) {
            if (i != n) {
                ability = b[i] + residue;
            } else {
                ability = residue;
            }
            if (a[i] < ability) {
                sum1 += a[i];
                residue = ability - a[i];
            } else {
                sum1 += ability;
                residue = 0;
            }
        }
        
        long sum2 = 0;
        residue = 0;
        ability = 0;
        
        for (int i = 0; i < n + 1; i++) {
            if (i != n) {
                ability = br[i] + residue;
                residue = Math.max(br[i] - ar[i], 0);
            } else {
                ability = residue;
            }
            
            if (ar[i] < ability) {
                sum2 += ar[i];
            } else {
                sum2 += ability;
            }
        }
        
        System.out.println(Math.max(sum1, sum2));
    }
    
    static long[] reverse(long[] array) {
        int l = array.length;
        long[] rev = new long[l];
        for (int i = 0; i < l; i++) {
            rev[i] = array[l - i - 1];
        }
        return rev;
    }
}

