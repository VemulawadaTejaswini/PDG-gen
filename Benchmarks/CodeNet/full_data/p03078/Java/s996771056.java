import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int X, Y, Z, K;
        {int[] a = r.ii(); X = a[0]; Y = a[1]; Z = a[2]; K = a[3];}
        long[] A = r.ll();
        long[] B = r.ll();
        long[] C = r.ll();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> {
                    long d = -x[0]+y[0];
                    return d > 0 ? 1 : d == 0 ? 0 : -1;});
        pq.add(new long[]{A[X-1]+B[Y-1]+C[Z-1],X-1,Y-1,Z-1});
        StringBuilder sb = new StringBuilder();
        boolean[][][] isAdded = new boolean[X][Y][Z];  
        isAdded[X-1][Y-1][Z-1] = true;
        for(int l = 0; l < K; l++){
            long[] temp = pq.poll();
            sb.append(temp[0]+"\n");
            int i = (int)temp[1];
            int j = (int)temp[2];
            int k = (int)temp[3];
            long[] x;
            if(i > 0 && !isAdded[i-1][j][k]){
                pq.add(new long[]{A[i-1]+B[j]+C[k], i-1, j, k});
                isAdded[i-1][j][k] = true;
            }
            if(j > 0 && !isAdded[i][j-1][k]){
                pq.add(new long[]{A[i]+B[j-1]+C[k], i, j-1, k});
                isAdded[i][j-1][k] = true;;
            }
            if(k > 0 && !isAdded[i][j][k-1]){
                pq.add(new long[]{A[i]+B[j]+C[k-1], i, j, k-1});
                isAdded[i][j][k-1] = true;
            }
        }
        print(String.valueOf(sb));
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