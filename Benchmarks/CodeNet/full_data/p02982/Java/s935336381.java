import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();      
        int N, D;
        {int[] a = r.ii(); N = a[0]; D = a[1];}
        int[][] X = new int[N][];
        for(int i = 0; i < N; i++)
            X[i] = r.ii();
        int ans = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                double d = 0;
                for(int k = 0; k < D; k++){
                    d += pow(X[i][k]-X[j][k]);
                }
                d = Math.sqrt(d);
                if(d%1 == 0){
                    ans++;
                }
            }
        }
        println(ans);
    }
    static int pow(int x){
        return x*x;
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