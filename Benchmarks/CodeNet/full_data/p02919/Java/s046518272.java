import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N = r.i();
        int[] P = r.ii();

        int[] Q = new int[N+1];
        for(int i = 0; i < N; i++)
          Q[P[i]] = i;

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, -1, -1, N, N);

        long ans = 0;
        for(int v = N; v > 0; v--){
          int i = Q[v];
          int j = -Collections.binarySearch(list, i)-1;
          Iterator<Integer> iterator = list.listIterator(j-2);
          long w = iterator.next();
          long x = iterator.next();
          long y = iterator.next();
          long z = iterator.next();
          long c = (x-w)*(y-i) + (i-x)*(z-y);
          list.add(j, i);
          ans += v*c;
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
