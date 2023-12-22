import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N; 
        long K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        int[] A = r.ii();
        int MOD = 1000000007;
        long num = 0;
        for(int i = 0; i < N-1; i++){
            int a = A[i];
            long n1 = 0;
            long n2 = 0;
            for(int j = i+1; j < N; j++){
                int b = A[j];
                if(a > b){
                    n1++;
                } else if (a < b){
                    n2++;
                }
            }
            num = (num+(K*(K+1))%MOD*n1/2)%MOD;
            num = (num+(K*(K-1))%MOD*n2/2)%MOD;
        }
        
        println(num);        
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