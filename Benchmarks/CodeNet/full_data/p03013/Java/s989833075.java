import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer[] Ms = new Integer[M];
        for (int m = 0; m < M; m++){
            Ms[m] = sc.nextInt();
        }
        long[] memo = new long[N+1];
        for (int n = 1; n <= N; n++){
            // if (n == 0){
                // memo[0] = 0;
                // continue;
            // }
            if (n == 1) {
                if (Arrays.asList(Ms).contains(1)){memo[1] = 0;}
                else {memo[1] = 1;}
                continue;
            }
            if (n == 2){
                if (Arrays.asList(Ms).contains(2)){memo[2] = 0;}
                if (Arrays.asList(Ms).contains(1)){memo[2] = 1;}
                else {memo[2] = 2;}
                continue;
            }
            boolean inN = Arrays.asList(Ms).contains(n);
            if ((inN) && (Arrays.asList(Ms).contains(n-1))){
                break;
            }
            if (inN) {
                continue;
            }
            memo[n] = (memo[n-2] + memo[n-1])%1000000007;
        }
        System.out.println(memo[N]%1000000007);
      }
}
