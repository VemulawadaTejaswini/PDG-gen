import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[] a = new boolean[n];
        for (int i=0;i<m;i++){
            int t = scan.nextInt();
            a[t-1] = true;
        }
        long sum = 0;
        long[] g = new long[n];
        g[0] = 1;
        g[1] = 1;
        if (a[0] == true){
            g[1] = 0;
        }
        sum = find(2, n, a, g);
        long q = 1000000007;
        System.out.println((long) sum % q);
    }

    static long find(int current, int n, boolean[] a, long[] g){
        
        if (current == n){
            return g[n-1]+g[n-2];
        }
        
        if (a[current-1] == true){
            g[current] = 0;
        }
        else{
            g[current] = g[current-1] + g[current-2];
        }     
        long sum = 0;
        sum = find(current + 1, n, a, g);
        return sum;
    }
}