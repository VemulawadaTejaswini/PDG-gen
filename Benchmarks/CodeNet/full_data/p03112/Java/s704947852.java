import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int query = sc.nextInt();
        
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        
        while (query-- > 0) {
            long now = sc.nextLong();
            int aR = upperBound(a, now);
            int aL = aR - 1;
            int bR = upperBound(b, now);
            int bL = bR - 1;
            
            long min = 1000000000000000000L;
            if (aL != -1 && bL != -1) {
                min = Math.min(min, Math.abs(now - a[aL]) + Math.abs(a[aL] - b[bL]));
                min = Math.min(min, Math.abs(now - b[bL]) + Math.abs(a[aL] - b[bL]));
            }
            if (aL != -1 && bR != b.length) {
                min = Math.min(min, Math.abs(now - a[aL]) + Math.abs(a[aL] - b[bR]));
                min = Math.min(min, Math.abs(now - b[bR]) + Math.abs(a[aL] - b[bR]));
            }
            if (aR != a.length && bL != -1) {
                min = Math.min(min, Math.abs(now - a[aR]) + Math.abs(a[aR] - b[bL]));
                min = Math.min(min, Math.abs(now - b[bL]) + Math.abs(a[aR] - b[bL]));
            }
            if (aR != a.length && bR != b.length) {
                min = Math.min(min, Math.abs(now - a[aR]) + Math.abs(a[aR] - b[bR]));
                min = Math.min(min, Math.abs(now - b[bR]) + Math.abs(a[aR] - b[bR]));
            }
            
            System.out.println(min);
        }
    }
    
    public static int upperBound(long[] array, long target) {
        // 初めてのtarget超過のindexを返す
        // {1, 3, 3, 7} target: 3 -> 3
        
        int left = 0;
        int right = array.length;
        
        while (left < right) {
            int center = (left + right) / 2;
            if (array[center] <= target) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        
        return left;
    }
}
