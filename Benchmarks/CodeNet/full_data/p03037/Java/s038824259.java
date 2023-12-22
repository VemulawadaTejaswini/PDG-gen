import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader rd = new Reader();    
        int N, M;
        {int[] a = rd.ii(); N = a[0]; M = a[1];}
        int l = 1;
        int r = N;
        for(int i = 0; i < M; i++){
            int[] a = rd.ii();
            if(l < a[0])
                l = a[0];
            if(a[1] < r)
                r = a[1];                
        }
        println(Math.max(r-l+1, 0));
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