import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, M, bSize = 0;
        {int[] temp = r.ii(); N = temp[0]; M = temp[1];}
        int[] A = r.ii();
        int[][] BC = new int[M][2];
        for(int i = 0; i < M; i++){
            BC[i] = r.ii();
            bSize += BC[i][0];
        }
        Arrays.sort(A);
        Arrays.sort(BC, (x, y) -> -x[1]+y[1]);
        int[] D = new int[Math.min(N, bSize)];
        for(int i = 0, j = 0; i < D.length; i++){
            if(BC[j][0] < 1)
                j++;
            D[i] = BC[j][1];
            BC[j][0]--;
        }
        for(int i = 0; i < D.length && A[i] < D[i]; i++)
            A[i] = D[i];
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