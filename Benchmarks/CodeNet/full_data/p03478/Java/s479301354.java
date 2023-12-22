import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int N, A, B;
        {int[] a = r.ii(); N = a[0]; A = a[1]; B = a[2];}
        int base ;
        int ans = 0;
        for(int i = 1; i <= N; i++){
            int x = 0;
            int temp = i;
            while(temp > 0){
                x += temp%10;
                temp /= 10;
            }
            if(B < x)
                i += -i%10+9;
            else if(A <= x)
                ans += i;
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