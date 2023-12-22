import java.io.*;
import java.util.*;
public class Main{
    static int cSize = 2001;
    static long[][] C = new long[cSize][cSize];    
    static {
        for(int i = 0; i < cSize; i++){
            Arrays.fill(C[i], -1);
            C[i][0] = C[i][i] = 1;
        }        
    }
    static long c(int n, int r){
        if(n < r)
            return 0;
        else if(C[n][r] > -1)
            return C[n][r];
        else
            if(n/2 < r)
                return C[n][r] = c(n, n-r);
            else
                return C[n][r] = (c(n-1, r-1)+c(n-1, r))%1000000007;
    }
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= K; i++){
            sb.append((c(N-K+1, i)*c(K-1, i-1))%1000000007);
            sb.append("\n");
        }
        print(sb);
    }

    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}