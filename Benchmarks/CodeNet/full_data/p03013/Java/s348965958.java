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
        for (Integer n = 0; n <= N; n++){
            // System.out.println("n:"+n);
            if (n == 0){
                memo[0] = 0;
                continue;
            }
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
            if ((Arrays.asList(Ms).contains(n)) && (Arrays.asList(Ms).contains(n-1))){
                // System.out.println(0);
                break;
            }
            if (Arrays.asList(Ms).contains(n)) {
                continue;
            }
            int tmp = 0;

            // if (!Arrays.asList(Ms).contains(n-1)){
            //     tmp += memo[n-1]+1;
            // }
            // if (!Arrays.asList(Ms).contains(n-2)){
            //     tmp += memo[n-2]+1;
            // }
            memo[n] = memo[n-2] + memo[n-1];
            // System.out.println("memo[n]: "+n+" "+memo[n]);
        }
        // System.out.println(memo[N]+" "+memo[N]%1000000007);
        System.out.println(memo[N]%1000000007);
      }
}

