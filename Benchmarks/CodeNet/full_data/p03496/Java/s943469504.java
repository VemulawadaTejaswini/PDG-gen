import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int N = r.i();
        int[] a = r.ii();
        int max = a[0];
        int maxI = 0;
        for(int i = 0; i < N; i++){
            if(max < a[i]){
                max = a[i];
                maxI = i+1;
            }
        }
        int min = a[0];
        int minI = 0;
        for(int i = 0; i < N; i++){
            if(a[i] < min){
                min = a[i];
                minI = i+1;
            }
        }
        boolean one = true;
        if(max*min < 0){
            println(2*N-1);
            one = false;
            if(max < -min){
                for(int i = 1; i <= N; i++)
                    println(minI+" "+i);   
                max = -1;
            } else{
                for(int i = 1; i <=N; i++)
                    println(maxI+" "+i);                
                min = 1;
            }
        }
        if(one)
            println(N-1);
        if(min >= 0)
            for(int i = 1; i < N; i++)
                println(i+" "+(i+1));
        else if(max <= 0)
            for(int i = N; i >= 2; i--)
                println(i+" "+(i-1));
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