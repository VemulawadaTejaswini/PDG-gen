import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long m = Long.parseLong(sc.next());
        
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        int h2 = 0;
        {
            long tmp = a[0];
            while(tmp%2==0){
                tmp /= 2;
                h2++;
            }
        }
        
        long fact = 1;
        for(int i=0; i<n; i++){
            int cnt2 = 0;
            {
                long tmp = a[i];
                while(tmp%2==0){
                    tmp /= 2;
                    cnt2++;
                }
            }
            if(cnt2 != h2){
                System.out.println(0);
                System.exit(1);
            }
            fact = lcm(fact, a[i]/2);
        }
        
        System.out.println((m+fact)/fact/2);
    }
    
    public static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    public static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
