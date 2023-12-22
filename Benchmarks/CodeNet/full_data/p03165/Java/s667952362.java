import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
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

    static class Task {
         // for declaring
        // pair for int, int - int[][] arr = new int[2][n];

        public void solve(int testNumber, InputReader in, PrintWriter out) {

                char[] s = in.next().toCharArray(), t = in.next().toCharArray();
                int[][] dp = new int[s.length+1][t.length+1];
                for(int i =0 ; i < s.length ; i++ ){
                    for(int j = 0 ; j < t.length ; j++ ){
                        if(s[i] == t[j] ){
                            dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+1);
                        }else{
                            dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i+1][j]);
                            dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j+1]);
                        }
                    }
                }
                String ans = " ";
                int i = s.length , j = t.length ;
                while( i!= 0 && j != 0 ){
                    if( s[i-1] == t[j-1]){
                        ans += s[i-1];
                        i--;j--;
                    } else if (dp[i-1][j] > dp[i][j-1] ){
                        i--;
                    } else {
                        j--;
                    }
                }
                StringBuilder ans1 = new StringBuilder(ans);
                ans1.reverse();
                out.println(ans1);
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


