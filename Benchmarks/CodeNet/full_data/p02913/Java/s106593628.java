import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        
        int[] length = zAlgorithm(c);
        
        int max = 0;
        for (int i = 1; i < n; i++) {
            int l = length[i];
            if (l > n / 2 + 1) continue;
            if (l == n / 2 + 1) l = n / 2;
            max = Math.max(max, l);
        }
        
        System.out.println(max);
    }
    
    public static int[] zAlgorithm(char[] c) {
        int[] A = new int[c.length];
        
        A[0] = c.length;
        int i = 1, j = 0;
        while (i < c.length) {
            while (i + j < c.length && c[j] == c[i + j]) {
                j++;
            }
            
            A[i] = j;
            
            if (j == 0) {
                i++;
                continue;
            }
            
            int k = 1;
            while (i + k < c.length && k + A[k] < j) {
                A[i + k] = A[k];
                k++;
            }
            
            i += k; j -= k;
        }
        
        return A;
    }
}
