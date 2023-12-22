
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
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
        static  int[] count;
        static  boolean[] visited;
        static ArrayList<Integer>[] frinds;
        static int[] color ;
        public static void dfs(int v , int val){
            visited[v]=true;
            count[val]++;
            color[v]=val;
            if (frinds[v]!=null)for (int u: frinds[v]) {
                if (!visited[u]) dfs(u , val);
            }
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            arr1[0]=in.nextInt();
            for (int i = 1; i <n; i++) {
                arr1[i]=arr1[i-1]+in.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                arr2[i]=in.nextInt();
            }
            for (int i = n-2; i >=0 ; i--) {
                arr2[i]+=arr2[i+1];
            }
            int ans = 0;
            for (int i = 0; i <n ; i++) {
                ans=Math.max(ans, arr1[i]+arr2[i]);
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