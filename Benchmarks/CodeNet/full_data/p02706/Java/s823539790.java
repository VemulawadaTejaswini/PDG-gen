import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[m];
        long sum = 0;
        for(int i = 0;i < m;i++){
            sum+=sc.nextInt();
        }
        if(sum<n){
            System.out.println(n-sum);
        }else{
            System.out.println(-1);
        }

        

    }

}
