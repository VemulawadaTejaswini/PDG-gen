import java.util.*;
import java.lang.*;

public class Main {
    static Set<Long> divisors(long N){
        Set<Long> ans = new HashSet<>();
        for(long n=1; n*n<=N; n++){
            if(N%n==0){
                ans.add(n);
                ans.add(N/n);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        // N := am+b
        // n/m==a, N%m == b
        // ans: a==b < m, N=a(m+1)
        long ans = 0;
        for(long a: divisors(N)) {
            long m = N/a-1;
            if(a<m){
                ans+=m;
            }
        }
        System.out.println(ans);
    }
}