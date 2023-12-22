
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static void bin(int n) {
        if (n > 1)
            bin(n/2);

        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }
    static class Pair<a , b>{
        a v1;
        b v2;
        Pair(a v1 , b v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }
    static class TaskA {
        static int lastdigit(int a){
            while (a/10>0){
                a/=10;
            }
            return a%10;

        }
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int[][] count = new int[10][10];
            for (int i = 1; i <=n;i++) {
                count[lastdigit(i)][i%10]++;
            }
            long ans=0;
            for (int i = 1; i <10; i++){
                for (int j = 1; j <10;j++) {
                    ans+=count[i][j]*count[j][i];
                }
            }
            System.out.println(ans);






        }

    }

    static class InputReader {
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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}