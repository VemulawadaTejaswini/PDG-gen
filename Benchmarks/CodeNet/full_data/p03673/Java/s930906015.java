import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();    
        int n = r.i();
        int[] a = r.ii();
        int[] b = new int[n];
        int i = 0;
        int j;
        while((j = n-1-2*i) >= 0){
            b[i] = a[j];
            i++;
        }
        j = 2*i-n;
        while(i < n){
            b[i] = a[j];
            i++;
            j+=2;
        }           
        StringBuffer sb = new StringBuffer();
        for(int x : b)
            sb.append(String.format("%d ", x));
        println(String.valueOf(sb));
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