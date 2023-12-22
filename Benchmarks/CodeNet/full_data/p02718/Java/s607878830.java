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
         int n=in.nextInt();
         int m=in.nextInt();
         int a[]=new int[n];
         long sum=0;
         for(int i=0;i<n;i++){ a[i]=in.nextInt(); sum+=a[i]; }
         Arrays.sort(a);
         int count=0;
         for(int i=n-1;i>=0;i--)
         {
             if(a[i]>=sum/(4*m)) count++;
         }
         if(count>=m) out.println("Yes");
         else out.println("No");
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
 