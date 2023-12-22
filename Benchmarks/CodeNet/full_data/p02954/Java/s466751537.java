import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader rd = new MyReader();        
        String S = rd.s();
        int N = S.length();
        int[] ans = new int[N];
        for(int i = 0; i < N;){
            int j = i;
            while(S.charAt(j) == 'R')
                j++;            
            int r = j-1;
            int l = j;
            while(j < N && S.charAt(j) == 'L')
                j++;            
            int rn = r-i+1;
            int ln = j-l;
            ans[r] = (rn+1)>>1+ln>>1;
            ans[l] = rn>>1+(ln+1)>>1;            
            i = j;
        }
        StringBuilder sb = new StringBuilder();
        for(int a : ans)
            sb.append(a).append(" ");
        println(sb);
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
