import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception{

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(in,out);
        out.close();
    }

    static class Task{

        public void solve(InputReader in ,PrintWriter out){

            long a = in.nextLong();
            long b = in.nextLong();
            long mid = (a+b)/2;
            if(Math.abs(a - mid) == Math.abs(b - mid))
              out.println(mid);
            else 
              out.println("IMPOSSIBLE");
        }
    }

    static class InputReader{

        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream inputStream){
            reader = new BufferedReader(new InputStreamReader(inputStream));
            tokenizer = null;
        }

        public String next(){
            while(tokenizer == null || !tokenizer.hasMoreTokens()){
                try{
                    tokenizer = new StringTokenizer(reader.readLine());
                }
                catch(IOException e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong(){
            return Long.parseLong(next());
        }
    }
}