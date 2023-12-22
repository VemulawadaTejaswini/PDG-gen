import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[1001];
        int[] b = new int[1001];
        int[] c = new int[1001];

        int[][] dist = new int[101][101];
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                if(i==j) dist[i][j] = 0;
                else dist[i][j] = (int)1e7;
            }
        }

        for(int i=0;i<m;i++){
            a[i] = in.nextInt()-1;
            b[i] = in.nextInt()-1;
            c[i] = in.nextInt();
            dist[a[i]][b[i]] = c[i];
            dist[b[i]][a[i]] = c[i];
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int ans = m;
        for(int j=0;j<m;j++){
            boolean check = false;
            for(int i=0;i<n;i++){
                if(dist[i][a[j]]+c[j] == dist[i][b[j]] || dist[i][b[j]]+c[j] == dist[i][a[j]]) check = true;
            }
            if(check) ans--;
        }
        out.print(ans);

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
