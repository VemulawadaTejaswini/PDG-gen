import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, A;
        {int[] a = in.ii(); N = a[0]; A = a[1];}
        int[] x = in.ii();
        int r = 0;
        int l = 0;
        for(int i = 0; i < x.length; i++){
            x[i] -= A;
            if(x[i] < 0) l += x[i];
            else if(x[i] > 0) r += x[i];
        }
        int M = r-l+1;
        long[][] dp = new long[N+1][M];
        dp[0][-l] = 1;
        
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < M; j++){
                dp[i][j] = dp[i-1][j];
                int j2 = j-x[i-1];
                if(0 <= j2 && j2 < M){
                    dp[i][j] += dp[i-1][j2];
                }
            }
        }
        out.println(dp[N][-l]-1);
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

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
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
