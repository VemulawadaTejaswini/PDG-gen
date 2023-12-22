import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        
        long ans = 0;
        for(long i=1; i*i<=n; i++){
            long x = (n-i)/i;
            if(x!=0 && n%x==i){
                ans += x;
            }
        }
        
        System.out.println(ans);
    }
}
