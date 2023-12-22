import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int K = scanner.nextInt();
        final int div = 1000000000 + 7;
        int[] count = new int[K+1];
        int[] memo = new int[K+1];
        for(int i=K; i>=1; i--){
            int n = K/i;
            if(memo[n]>0){
                count[i] = memo[n];
            }else{
                long c = 1;
                for(int j=0; j<N; j++){
                    c = c*n;
                    c = c%div;
                }
                count[i] = (int)c;
                memo[n] = (int)c;
            }
            for(int k=2; k<=n; k++){
                count[i] = count[i] + div - count[i*k];
                count[i] = count[i] % div;
            }
        }
        long res = 0;
        for(int i=1; i<=K; i++){
            long add = ((long)count[i]*(long)i) % div;
            res = (res + add) % div;
        }
        System.out.println(res);
    }
}