import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
public class Main {
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver=new Task();
        solver.solve(1,in,out);
        out.close();
    }
    static class Task{
        public void solve(int testnumber,InputReader in,PrintWriter out){
            int n = in.nextInt();
            int k = in.nextInt();
            int [] a = new int[k];
            for(int i=0;i<k;i++){
                a[i]=in.nextInt();
            }
            for(int i=n;i<=10*n;i++){
                if(is_ok(i,a)){
                    out.println(i);
                    break;
                }
            }
        }

        private boolean is_ok(int i,int [] a) {
            while(i != 0){
                int t = i % 10;
                for(int j=0;j<a.length;j++){
                    if(t == a[j]){
                        return false;
                    }
                }
                i /= 10;
            }
            return true;
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
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
