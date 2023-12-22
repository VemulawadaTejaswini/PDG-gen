import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader rd = new MyReader();        
        int N = rd.i();
        int[] A = rd.ii();
        int[] l = new int[N];
        int[] r = new int[N];
        l[1] = A[0];
        r[N-2] = A[N-1];
        for(int i = 2; i < N; i++)
            l[i] = gcd(l[i-1], A[i-1]);
        for(int i = N-3; i >= 0; i--)
            r[i] = gcd(r[i+1], A[i+1]);
        l[0] = r[0];
        r[N-1] = l[N-1];
        int max = 1;
        for(int i = 0; i < N; i++){
            int temp = gcd(l[i], r[i]);
            if(max < temp)
                max = temp;
        }
        println(max);
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
    static int gcd(int... ii){
        int N = ii.length;
        int gcd = ii[0];
        for(int i = 1; i < N; i++){
            int a = gcd;
            int b = ii[i];
            if(b < a){
                int c = a;
                a = b;
                b = c;
            }
            int r;
            while((r=b%a)>0){
                b = a;
                a = r;
            }   
            gcd = a;
        }
        return gcd;
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
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}