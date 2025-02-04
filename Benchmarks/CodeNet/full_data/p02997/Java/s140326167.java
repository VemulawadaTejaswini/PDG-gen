import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        int k = (N-1)*(N-2)/2;
        if(N == 2 || k < K){
            println(-1);
            return;
        } else{
            int extra = k-K;
            int M = N-1+k-K;
            println(M);
            int n = 1;
            for(int i = 1; i < N; i++){
                println(i+" "+N);
            }
            for(int i = 1; i < N-1; i++){
                for(int j = i+1; j < N; j++){
                    println(i+" "+j);
                    extra--;
                    if(extra == 0){
                        return;
                    }
                }
            }
        }
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