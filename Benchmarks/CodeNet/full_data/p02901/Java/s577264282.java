import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        for(int i=0; i<M; i++){
            int ai= scanner.nextInt();
            int bi= scanner.nextInt();
            a[i] = ai;
            b[i] = bi;
            for(int j=0; j<bi; j++){
                c[i] = c[i] | (1<<(scanner.nextInt()-1));
            }
        }
        int[] dp = new int[1<<N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<(1<<N); i++){
            if(dp[i] != Integer.MAX_VALUE){
                for(int j=0; j<M; j++){
                    dp[i|c[j]] = Math.min(dp[i|c[j]], dp[i] + a[j]);
                }
            }
        }
        if(dp[(1<<N) - 1]==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(dp[(1<<N) -1]);
        }
    }
}