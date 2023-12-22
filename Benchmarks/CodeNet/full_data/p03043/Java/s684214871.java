import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        for(int i = 1; i <= n; i++){
            long tmp = (long)n;
            if(i >= k){
                ans += 1d/(double)tmp;
                continue;
            }
            int now = i;
            while(now < k){
                now *= 2;
                tmp *= 2;
            }
            ans += 1d/(double)tmp;
        }
        System.out.println(String.format("%.12f", ans));
    }
}
