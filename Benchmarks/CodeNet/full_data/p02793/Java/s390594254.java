import java.util.*;

public class Main{
    
    public static final int MAX = (int)1e5*2+9;
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long lcm = 1;
        for(int i=0; i<n; i++){
            lcm = lcm(lcm, a[i]);
        }
        
        long ans = 0;
        for(int i=0; i<n; i++){
            long tmp = lcm / a[i];
            ans += tmp;
            ans %= MOD;
        }
        
        System.out.println(ans);
        
    }
    
    private static long lcm(long num1, long num2) {
        return num1 / gcd(num1, num2) * num2;
    }
    
    public static long gcd(long num1,long num2) {
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}
