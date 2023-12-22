import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        int K = sc.nextInt();
        long ans = 0;
        if(K==0){
            System.out.println(N * N);
            return;
        }

        for(int i=1; i<=N; i++){
            ans += N / i *Math.max(0, i - K);
            ans += Math.max(0, N % i - K + 1);
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}