import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        long A, B, C, D;
        {long[] a = r.ll(); A = a[0]; B = a[1]; C = a[2]; D = a[3];}
        long all = B-A+1;
        long c = B/C-(A-1)/C;
        long d = B/D-(A-1)/D;
        long E = lcm(C, D);
        long cd = B/E-(A-1)/E;
        println(all-c-d+cd);
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
    static long lcm(long... ll){
        int N = ll.length;   
        long gcd = gcd(ll);
        long lcm = ll[0];
        for(int i = 1; i < N; i++)
            lcm = lcm/gcd(lcm, ll[i])*ll[i];        
       return lcm;
    }
    static long gcd(long... ll){
        int N = ll.length;
        long gcd = ll[0];
        for(int i = 1; i < N; i++){
            long a = gcd;
            long b = ll[i];
            if(b < a){
                long c = a;
                a = b;
                b = c;
            }
            long r;
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