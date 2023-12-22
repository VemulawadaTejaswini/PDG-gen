import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader(); 
        int[] a = r.ii();
        print((int)((a[2]+0.5)/a[0])*a[1]);
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static int max(int[] ii){
        int max = ii[0];
        for(int i : ii) if(max < i) max = i;
        return max;
    }
    static int min(int[] ii){
        int min = ii[0];
        for(int i : ii) if(i < min) min = i;
        return min;
    }
    static long max(long[] ll){
        long max = ll[0];
        for(long l : ll) if(max < l) max = l;     
        return max;
    }
    static long min(long[] ll){
        long min = ll[0];
        for(long l : ll) if(l < min) min = l;
        return min;
    }
    static double max(double[] dd){
        double max = dd[0];
        for(double d : dd) if(max < d) max = d;
        return max;
    }
    static double min(double[] dd){
        double min = dd[0];
        for(double d : dd) if(d < min) min = d;
        return min;
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int i() throws IOException{
            return Integer.parseInt(readLine());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int j = 0; j < N; j++) ii[j] = i();
            return ii;
        }
        long l() throws IOException{
            return Long.parseLong(readLine());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
        long[] ll(int N) throws IOException{
            long[] ll = new long[N];
            for(int j = 0; j < N; j++) ll[j] = i();            
            return ll;
        }
    }
}