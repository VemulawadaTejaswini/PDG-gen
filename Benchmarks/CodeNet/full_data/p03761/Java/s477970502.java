import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        int n = r.i();
        int[][] count = new int[n][26];
        for(int i = 0; i < n; i++){
            String s = r.s();
            int len = s.length();
            for(int j = 0; j < len; j++)
                count[i][s.charAt(j)-'a']++;
        }
        char[] ans = new char[60];
        int end = 0;
        for(char c = 'a'; c < 'z'+1; c++){
            int num = count[0][c-'a'];
            for(int i = 1; i < n ; i++)
                num = Math.min(num, count[i][c-'a']);
            for(int i = 0; i < num; i++)
                ans[end++] = c;
        }
        println(String.valueOf(ans, 0, end));
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