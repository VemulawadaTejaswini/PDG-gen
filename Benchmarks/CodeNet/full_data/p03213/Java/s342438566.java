import java.io.*;
public class Main{
    static int[] e;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int N = r.i();
        e = new int[N+1];
        for(int i = 2; i < e.length; i++){
            int cur = i;
            for(int j = 2; j < i+1; j++){
                while(cur%j == 0){
                    e[j] += 1;
                    cur /= j;
                }
            }
        }        
        print(num(75)+num(25)*(num(3)-1)+num(15)*(num(5)-1)+num(5)*(num(5)-1)*(num(3)-2)/2);
    }
    static int num(int m){
        int num = 0;
        for(int x : e) if(m-2 < x) num++;
        return num;
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