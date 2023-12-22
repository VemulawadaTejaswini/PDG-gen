
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double ans = 0;
        if(k <= n){
            ans = (double)(n-k+1)/n;
        }

        int x = 1;
        int tw = 2;
        for(int i = Math.min(n,k-1);i > 0;i--){
            while(i * tw < k){
                x++;
                tw *= 2;
            }
            ans += (double)1/n * (double)1/tw;
        }

        System.out.println(ans);
    }
}