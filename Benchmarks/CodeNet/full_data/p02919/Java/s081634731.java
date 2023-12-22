import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader rd = new MyReader();        
        int N = rd.i();
        int[] P = rd.ii();
        int[] q = new int[N+1];
        for(int i = 0; i < N; i++)
            q[P[i]] = i + 1;

        long ans = 0;
        int[] l = new int[N+2];
        int[] r = new int[N+2];
        for(int i = 0; i < N+1; i++){
            l[i+1] = i;
            r[i] = i+1;
        }
        r[N+1] = N+1;

        for(int i = 1; i < N+1; i++){
            int v = q[i];
            int l1 = l[v];
            int r1 = r[v];
            long l2 = l[l1];
            long r2 = r[r1];
            ans += i*((v-l1)*(r2-r1) + (r1-v)*(l1-l2));
            l[r1] = l1;
            r[l1] = r1;
        }
        println(ans);
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