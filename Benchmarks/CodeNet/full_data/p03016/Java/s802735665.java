import java.io.*;
public class Main{
    static long M;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();   
        long L, A, B;
        {long[] a = r.ll(); L = a[0]; A = a[1]; B = a[2]; M = a[3];}
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < L; i++)
            sb.append(String.valueOf(A+B*i));
        String s = new String(sb);
        println(recursive(s));
    }
    static String recursive(String s){
        int len = s.length();
        if(18 < len){
            return recursive(String.format("%d%s",Long.parseLong(s.substring(0, 18))%M, s.substring(18, len)));
        } else {
            return String.valueOf(Long.parseLong(s)%M);
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
