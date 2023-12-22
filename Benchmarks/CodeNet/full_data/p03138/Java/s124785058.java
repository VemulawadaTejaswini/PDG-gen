import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int N;
    static int[] c = new int[40];
    public static void main(String[] args){
        long K;
        {long[] a = in.ll(); N = (int)a[0]; K = a[1];}
        long[] A = in.ll();
        for(int i = 0; i < 40; i++)
            for(int j = 0; j < N; j++)
                c[i] += (A[j]>>i)&1;

        out.println(rec(39, K));
        out.flush();
    }

    static long rec(int d, long k){
        if(d < 0) return 0;
        if(1L<<d <= k && c[d] < N-c[d]){
            return ((long)N-c[d]<<d) + rec(d-1, k&((1L<<d)-1));
        } else {
            return ((long)c[d]<<d) + rec(d-1, k&((1L<<d)-1));
        }
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
