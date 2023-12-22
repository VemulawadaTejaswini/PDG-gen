import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        long A, B;
        {long[] a = in.ll(); A = a[0]; B = a[1];}
        if(B < A){
            long tmp = A;
            A = B;
            B = tmp;
        }
        
        long g = gcd(A, B);
        
        int ans = 1;
        double C = Math.sqrt(g+1);
        for(int i = 2; i < C; i++){
            if(g%i == 0){
                ans++;
                while(g%i == 0)
                    g /= i;
            }
        }
        if(g != 1){
            ans++;
        }
        out.println(ans);
        
        out.flush();
    }
    
    static long gcd(long a, long b){
        long r;
        while((r = b%a) > 0){
            b = a;
            a = r;
        }
        return a;
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
