import java.io.*;
import java.util.*;
 

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Unstoppable solver = new Unstoppable();
	//	int t=in.nextInt();
	//	while(t-->0)
        solver.solve(in, out);
        out.close();
    }
 
    static class Unstoppable {
        public void solve(InputReader in, PrintWriter out) {
          int k=in.nextInt();
          int n=in.nextInt();
          int a[]=new int[n];
          int diff[]=new int[n];
          for(int i=0;i<n;i++) a[i]=in.nextInt();
          for(int i=0;i<n-1;i++){ diff[i] = a[i+1] - a[i]; }
          diff[n-1]=k-a[n-1]; sum+=diff[n-1];
          Arrays.sort(diff);
          out.println(k-diff[n-1]);
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
        public long nextLong(){
            return Long.parseLong(next());
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
 