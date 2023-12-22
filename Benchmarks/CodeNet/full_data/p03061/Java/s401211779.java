import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N = r.i(),
            max = 0;
            
        int[] A = r.ii(),
              p = new int[N],
              q = new int[N];
              
        p[0] = A[0];
        q[N-1] = A[N-1];
        
        for(int i = 1; i < N; i++) p[i] = gcd(p[i-1], A[i]);
        for(int i = N-2; i >= 0; i--) q[i] = gcd(q[i+1], A[i]);
               
        for(int i = 1; i < N-1; i++){
            int gcd = gcd(p[i-1], q[i+1]);
            if(max < gcd) max = gcd;
        }
        
        int rest = Math.max(Math.max(p[N-1], q[1]), q[0]);
        if(max < rest) max = rest;
        
        print(max);
    }
    static int gcd(int a, int b){
        if(b < a){
            int c = a;
            a = b;
            b = c;
        }
        int r;
        while((r = b%a) > 0){
            b = a;
            a = r;
        }
        return a;
    }
    static void print(Object o){
        System.out.println(o.toString());
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
        int Int(String s){
            return Integer.parseInt(s);
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
    }
}
