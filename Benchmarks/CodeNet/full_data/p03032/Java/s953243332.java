import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        int[] V = r.ii();
        int R = Math.min(N, K);
        int max = 0;
        for(int a = 0; a <= R; a++){
            for(int b = 0; b <= R-a; b++){
                int[] v = new int[a+b];
                for(int i = 0; i < a; i++)
                    v[i] = V[i];
                for(int i = N-b; i < N; i++)
                    v[a+i-(N-b)] = V[i];
                Arrays.sort(v);
                int lmt = Math.min(K-a-b,v.length);
                for(int i = 0; i < lmt && v[i] < 0; i++)
                    v[i] = 0;
                int sum = 0;
                for(int t : v)
                    sum += t;
                if(max < sum)
                    max = sum;
            }
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
    static class Reader extends BufferedReader{
        Reader(){
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
