import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    ArrayList<Integer>[] G;
    int n;
    private void solve(){
        n = in.nextInt();
        int m = in.nextInt();

        G = new ArrayList[n];
        for(int i=0;i<n;i++){
            G[i]= new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            int u = in.nextInt();
            int v = in.nextInt();

            G[u-1].add(v-1);
            G[v-1].add(u-1);
        }
        out.print(visit(0,1));

    }

    private int visit(int u,int mask){
        int g = mask,c;
        for(c=0;g>0;g >>=1){
            c+= g & 1;
        }
        //out.println(c);
        if(c == n){
            return 1;
        }
        int count =0;
        for(int v:G[u]){
            if((mask & (1<<v)) == 0){
                //out.println(v +" "+mask);
                count+=visit(v,mask|(1<<v));
            }
        }
        return count;
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
