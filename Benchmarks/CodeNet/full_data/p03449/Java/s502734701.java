import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
        int[][] candy = new int[2][N];
        candy[0] = r.ii();
        candy[1] = r.ii();
        int[][] dp = new int[2][N];
        dp[0][0] = candy[0][0];
        dp[1][0] = dp[0][0] + candy[1][0];
        for(int j = 1; j < N; j++){
            dp[0][j] = dp[0][j-1]+candy[0][j];
            dp[1][j] = Math.max(dp[0][j], dp[1][j-1])+candy[1][j];
        }
        println(dp[1][N-1]);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
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