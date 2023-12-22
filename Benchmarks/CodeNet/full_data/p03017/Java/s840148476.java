import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N, A, B, C, D;
        {int[] a = r.ii(); N = a[0]; A = a[1]; B = a[2]; C = a[3]; D = a[4];}
        char[] S = r.s().toCharArray();
        for(int i = A; i < C-2; i++){
            if(S[i] == '#'){
                if(++i < C-1 && S[i] == '#'){
                    println("No");
                    return;
                }              
            }
        }
        for(int i = B; i < D-2; i++){
            if(S[i] == '#'){
                if(++i < D-1 && S[i] == '#'){
                    println("No");
                    return;
                }              
            }
        }
        
        if(C < D)
            println("Yes");
        else{
            for(int i = B-2; i < D-1; i++){
                if(S[i] == '.'){
                    if(++i < D && S[i] == '.'){
                        if(++i < D+1 && S[i] == '.'){
                            println("Yes");
                            return;
                        }
                    }
                }
            }
            println("No");
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