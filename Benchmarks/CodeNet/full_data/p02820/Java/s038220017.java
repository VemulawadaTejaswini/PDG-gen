
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int k = in.nextInt();
            int R = in.nextInt();
            int S = in.nextInt();
            int P = in.nextInt();
            String t = in.next();
            char[] arr = new char[n];
            long ans = 0;
            Map<Character , Character> map = new HashMap<>(3);
            Map<Character , Integer> val = new HashMap<>(3);

            map.put('r' , 'p');
            val.put('r' , R);
            map.put('p' , 's');
            val.put('p' , P);
            map.put('s' , 'r');
            val.put('s' , S);
            for (int i = 0; i <n; i++) {
                if (i < k){
                   if (i+k<n)arr[i+k]=map.get(t.charAt(i));
                    ans+=val.get(map.get(t.charAt(i)));
                }
                else {
                    if (arr[i] != map.get(t.charAt(i))){
                        if (i+k<n) arr[i+k]=map.get(t.charAt(i));
                        ans+=val.get(map.get(t.charAt(i)));
                    }
                    else if (i+k < n)arr[i+k]='d';
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