import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N, W;
        {int[]a = r.ii(); N = a[0]; W = a[1];}
        int[] w = new int[N];
        int[] v = new int[N];
        int[][] things = new int[4][N+1];
        
        
        int[] a = r.ii();
        int w0 = a[0];
        things[0][0] = a[1];
        
        int w1 = w0+1;
        int w2 = w1+1;
        int w3 = w2+1;
        int[] num = {1, 0, 0, 0};

        for(int i = 0; i < N-1; i++){
            a = r.ii();
            int group = a[0]-w0;
            things[group][num[group]++] = a[1];
        }
        
        for(int i = 0; i < 4; i++)
            Arrays.parallelSort(things[i], 0, num[i]);
            
        long max = 0;
        for(int i = 0, v0 = 0; i <= Math.min(W/w0, num[0]); i++){
            if(i > 0)
                v0 += things[0][num[0]-i];
            for(int j = 0, v1 = 0; j <= Math.min((W-i*w0)/w1, num[1]); j++){
                if(j > 0)
                    v1 += things[1][num[1]-j];
                for(int k = 0, v2 = 0; k <= Math.min((W-i*w0-j*w1)/w2, num[2]); k++){
                    if(k > 0)
                        v2 += things[2][num[2]-k];
                    for(int l = 0, v3 = 0; l <= Math.min((W-i*w0-j*w1-k*w2)/w3, num[3]); l++){
                        if(l > 0)
                            v3 += things[3][num[3]-l];
                        max = Math.max(max, v0+v1+v2+v3);
                    }
                }
            }
        }
        println(max);
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