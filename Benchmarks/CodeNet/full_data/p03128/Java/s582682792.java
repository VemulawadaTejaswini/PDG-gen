import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args){
        int[] num = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        final int N, M; {int[] a = in.ii(); N = a[0]; M = a[1];}
        int[] A = in.ii();
        Arrays.sort(A);

        int[] dp = new int[N+1];
        dp[0] = 0;
        final int MIN = -Integer.MIN_VALUE;
        for(int i = 1; i < N+1; i++){
            int max = MIN;
            for(int j = 0; j < M; j++){
                int k = i-num[A[j]];
                if(k >= 0)
                    max = Math.max(max, dp[k] + 1);
            }
            dp[i] = max;
        }     

        int d = dp[N];
        int n = N;
        for(int i = 0; i < d; i++){
            for(int j = M-1; j >= 0; j--){
                int tmp = n-num[A[j]];
                if(tmp >= 0 && dp[tmp] == dp[n]-1){
                    out.print(A[j]);
                    n -= num[A[j]];
                    break;
                }
            }
        }
        out.flush();
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
