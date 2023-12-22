import java.util.*;
import java.lang.*;

public class Main {
    static int needCoin(int N, int K){
        int c=0;
        while(N<K){
            N *= 2;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        double ans = 0;
        for(int n=1; n<=N; n++){
            ans += (Math.pow(0.5, needCoin(n,K))/N);
        }

        System.out.println(ans);

    }
}
