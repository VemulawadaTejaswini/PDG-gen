import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        Integer[] C = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(a[i]);
            B[i] = Integer.parseInt(b[i]);
            C[i] = Integer.parseInt(c[i]);
        }
        
        Arrays.sort(A);
        Arrays.sort(C);
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int ab = ~Arrays.binarySearch(A, B[i], (x,y)->x.compareTo(y)>=0?1:-1);
            int bc = n - ~Arrays.binarySearch(C, B[i], (x,y)->x.compareTo(y)>0?1:-1);
            
            ans += (long)ab*bc;
        }
        
        System.out.println(ans);
    }
}



