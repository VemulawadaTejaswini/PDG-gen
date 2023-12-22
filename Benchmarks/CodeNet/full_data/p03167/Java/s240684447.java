import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {

    public static void recurse(ArrayList<ArrayList<Integer>> adj, int[] dp,int[] visited, int v){

        visited[v]=1;

        for(int i=0;i<adj.get(v).size();i++){
            if(visited[adj.get(v).get(i)]!=1){
                recurse(adj,dp,visited,adj.get(v).get(i));
            }
            dp[v]=Math.max(dp[v],dp[adj.get(v).get(i)]+1);

        }
    }

    public static void main(String[] args) throws IOException {

        Reader.init(System.in);
        int H = Reader.nextInt();
        int W = Reader.nextInt();
        char[][] grid=new char[H][W];
        for(int i=0;i<H;i++){
            String s = Reader.nextLine();
            for(int j=0;j<W;j++){
                grid[i][j]=s.charAt(j);
            }
        }
        long[][] dp=new long[H][W];
        int flag = 0;
        for(int i=0;i<W;i++){
            if(flag==0){
                if(grid[0][i] == '.'){
                    dp[0][i]=1;
                }
                else{
                    dp[0][i]=0;
                    flag=1;
                }
            }
        }
        flag = 0;
        for(int i=0;i<H;i++){
            if(flag==0){
                if(grid[i][0] == '.'){
                    dp[i][0]=1;
                }
                else{
                    dp[i][0]=0;
                    flag=1;
                }
            }
        }
        for(int i=1;i<H;i++){
            for(int j=1;j<W;j++){
                if(grid[i][j]=='.'){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
//        for(int i=0;i<H;i++){
//            for(int j=0;j<W;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println((dp[H-1][W-1])%1000000007);

    }

}






class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String nextLine() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( nextLine() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong(nextLine());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( nextLine() );
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat( nextLine() );
    }
    static int[] nextIntArray(int length) throws IOException {
        int[] arr = new int[length];
        //System.out.println(length);
        for (int i=0; i<length; i++) {
            arr[i] = Integer.parseInt( nextLine() );
            //System.out.println(arr[i]);
        }
        //System.out.println(arr);
        return arr;
    }
    static long[] nextLongArray(int length) throws IOException {
        long[] arr = new long[length];
        for (int i=0; i<length; i++) {
            arr[i] = Long.parseLong( nextLine() );
        }
        return arr;
    }

}

