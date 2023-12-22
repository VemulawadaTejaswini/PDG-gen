import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+2];
        a[0] = 0;
        a[n+1] = 0;
        long sum = 0;
        for(int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += sa(a[i-1],a[i]);
        }
        sum += sa(a[n+1],a[n]);
        for(int i=1; i<=n; i++) {
            System.out.println(sum-sa(a[i],a[i-1])-sa(a[i+1],a[i])+sa(a[i+1],a[i-1]));
        }
        
    }
    
    static int sa(int a, int c) {
        if(a <= c) {
            return c-a;
        }else {
            return a-c;
        }
    }
}