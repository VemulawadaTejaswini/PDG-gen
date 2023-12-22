import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int[][] swc = new int[M][];
        for(int i = 0; i < M; i++)
            swc[i] = r.ii();
        int[] p = r.ii();
        int ans = 0;
        for(int i = 0; i < Math.pow(2, N); i++){
            String swcS = String.format("%0" +N+ "d", Int(Integer.toBinaryString(i)));
            int num = 0;
            for(int j = 0; j < M; j++){
                int t = 0;
                for(int k = 0; k < swc[j][0]; k++){
                    if(swcS.charAt(swc[j][k+1]-1) == '1')
                        t++;
                }
                if(t%2 == p[j])
                    num++;
                else
                    break;
            }
            if(num == M)
                ans++;
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
