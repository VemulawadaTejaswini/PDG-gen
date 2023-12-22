import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int[] temp = r.ii();
        ArrayList<Integer> A = new ArrayList<>();
        for(int t : temp)
            A.add(t);
        A.sort(null);
        for(int i = 0; i < M; i++){
            int[] a = r.ii();
            int j = 0;
            for( ; j < a[0]; j++){
                if(A.get(j) < a[1])
                    A.set(j, a[1]);
                else
                    break;
            }
            if(j == 0)
                continue;
            int k = j;
            for(; k < N; k++)
                if(A.get(k) >= a[1])
                    break;
            ArrayList<Integer> X = new ArrayList<>();
            X.addAll(A.subList(j, k));
            X.addAll(A.subList(0, j));
            X.addAll(A.subList(k, N));
            A.clear();
            A.addAll(X);
        }
        long ans = 0;
        for(long a : A)
            ans += a;
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