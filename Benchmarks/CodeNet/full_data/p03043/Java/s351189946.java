import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N,K;
        N = sc.nextInt();
        K = sc.nextInt();
        double ans = 0.0;
        for(int i = 1;i <= N;i++){
            ans += calc((double)N,(double)i,(double)K);
        }
        System.out.println(ans);
    }
    static double calc(double n,double m,double k){
        double x = 0;
        if(m >= k) return 1.0 / n;
        for(int i = (int)m;i <= k;x++){
            i *= 2;
        }
        
        return 1.0 / n * Math.pow(0.5,x);
    }
}
