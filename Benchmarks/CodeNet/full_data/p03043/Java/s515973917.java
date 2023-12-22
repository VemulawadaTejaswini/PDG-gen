import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        double ans = 0;
        if(K <= N)
            ans += N-K+1;
        for(int i = 1; i <= Math.min(K-1, N); i++){
            int n = 0;
            int score = i;
            while(score < K){
                n++;
                score *= 2;
            }            
            ans += Math.pow(0.5, n);
        }
        ans /= N;
        print(ans);        
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
