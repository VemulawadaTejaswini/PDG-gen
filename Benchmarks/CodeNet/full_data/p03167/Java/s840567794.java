import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    class point{
        int x =0 , y = 0;
        point(int a , int b){
            this.x = a;
            this.y = b;
        }
    };

    static class Task {
         // for declaring
        int n , m;
        char[][] grid;
        int mod = 1_000_000_007;
        // pair for int, int - int[][] arr = new int[2][n];

        public void solve(int testNumber, InputReader in, PrintWriter out) {

                n = in.nextInt(); m = in.nextInt();
                grid = new char[n][m];
                int[][] paths = new int[n][m];
                for(int i = 0 ; i < n ; i++ ){
                    grid[i] = in.next().toCharArray();
                }
                paths[0][0] = 1;
                for(int i =1 ; i < n ; i++ ){
                    paths[i][0] = (grid[i][0]=='.')?paths[i-1][0]:0;
                }
                for(int i =1 ; i < m ; i++ ){
                    paths[0][i] = (grid[0][i]=='.')?paths[0][i-1]:0;
                }
                for(int i = 1; i<  n; i++ ){
                    for(int j = 1 ; j < m ; j++ ){
                        if(grid[i][j] == '.' ){
                            paths[i][j] = ( paths[i-1][j]+paths[i][j-1] )%mod;
                        }else{
                            paths[i][j]=0;
                        }
                    }
                }

                out.println(paths[n-1][m-1]);
            }


            public int max_element(int[] arr){
                for(int i = 1 ; i < arr.length ; i++ ){
                    if(arr[i]>arr[0])
                        arr[0] = arr[i];
                }
                return arr[0];
            }
        }



        public static void printArray(int[] arr){
            for(int i = 0 ; i < arr.length ; i++ ){
                System.out.println(arr[i]);
            }
        }
        public static void printArray(long[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(String[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(char[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }



    }

    class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }


