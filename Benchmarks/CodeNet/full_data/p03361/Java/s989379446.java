/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author nai
 */
public class Main
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        FastScanner sc = new FastScanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S  = sc.nextCharArray2(H, W);
        char[][] S2 = packArray2(S);
        int[] cl = {-1,0,1,0,-1};
        
                
        for (int hi = 1; hi < H + 1; hi++) {
            LOOP : for (int wi = 1; wi < W + 1; wi++) {
                if(S2[hi][wi] != '#'){
                    continue;
                }
                for (int i = 0; i < 4; i++) {
                    if(S2[hi + cl[i]][wi + cl[i + 1]] == '#'){
                        continue LOOP;
                    }
                }
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
     public static char[][] packArray2(char[][] a){
        int h = a.length;
        int w = a[0].length;
        char[][] b = new char[h + 2][w + 2];
        //char sym = '*';
        
        //上の面を梱包する
        /*for (int i = 0; i < w + 2; i++) {
            b[0][i] = sym; 
        }*/
        //中の梱包
        for (int i = 1; i < h + 1; i++) {
            
            //b[i][0] = sym;
            for (int j = 1; j < w + 1; j++) {
                b[i][j] = a[i -1][j - 1];
            }
            //b[i][w + 1] = sym;
        }
        //下の面を梱包する
        /*for (int i = 0; i < w + 2; i++) {
            b[h + 1][i] = sym; 
        }*/
        return b;
   }


    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            
            return tokenizer.nextToken("\n");
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
        public char[][] nextCharArray2(int h , int w){
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }
        public int [][] nextIntArray2(int h, int w){
            int[][] a = new int[h][w];
            for(int hi = 0 ; hi < h ; hi++){
                for(int wi = 0 ; wi < h ; wi++){
                    a[h][w] = nextInt();
                }
            }
            return a;
        }
        
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
        public long [][] nextLongArray2(int h, int w){
            long[][] a = new long[h][w];
            for(int hi = 0 ; hi < h ; hi++){
                for(int wi = 0 ; wi < h ; wi++){
                    a[h][w] = nextLong();
                }
            }
            return a;
        }
    }
}
