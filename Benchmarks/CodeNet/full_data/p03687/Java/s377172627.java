import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int res[] = new int[26];
            int max[] = new int[26];

            Arrays.fill(res,-1);

            for(int i=0; i<s.length(); i++){
                if(res[s.charAt(i)-'a']==-1){
                    res[s.charAt(i)-'a']=i;
                    max[s.charAt(i)-'a']=i-0;
                }
                else if(res[s.charAt(i)-'a']>-1){
                    if(i-res[s.charAt(i)-'a']-1>max[s.charAt(i)-'a']){
                        max[s.charAt(i)-'a']=i-res[s.charAt(i)-'a']-1;
                    }
                    res[s.charAt(i)-'a'] = i;
                }
                if(i==s.length()-1){
                    for(int j=0; j<26; j++){
                        if(i-res[j]>max[j]){
                            max[j]=i-res[j];
                        }
                    }
                }
            }
            int min = 100000;
            for(int i=0; i<26; i++){
                if(max[i]<min){
                    min = max[i];
                }
            }

            out.println(min);

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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}