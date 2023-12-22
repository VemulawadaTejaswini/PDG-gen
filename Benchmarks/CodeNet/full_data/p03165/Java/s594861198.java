
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void solve() throws IOException {
        String s1 = readString();
        String s2 = readString();
        int n = s1.length();
        int m = s2.length();
        int[][] all = new int[n+1][m+1];
        for(int i=0;i<=n; i++) {
            for(int j=0;j<=m;j++){
                if(i==0 || j==0) {
                    all[i][j] = 0;
                    continue;
                }
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    all[i][j]=1+all[i-1][j-1];
                    continue;
                }
                all[i][j]=Math.max(all[i-1][j], all[i][j-1]);
            }
        }
        if(all[n][m]==0) {
            System.out.println("");
            return;
        }
        char[] ans = new char[all[n][m]];
        int ansIndex = all[n][m]-1;
        int nindex = n;
        int mindex = m;
        while (ansIndex>=0){
            if(s1.charAt(nindex-1)==s2.charAt(mindex-1)){
                ans[ansIndex]=s1.charAt(nindex-1);
                nindex--;
                mindex--;
                ansIndex--;
                continue;
            }
            if(nindex-1>=0 && all[nindex][mindex]==all[nindex-1][mindex]) {
                nindex--;
                continue;
            }
            if(mindex-1>=0 && all[nindex][mindex]==all[nindex][mindex-1]) {
                mindex--;
                continue;
            }
        }
        System.out.println(new String(ans));
    }
}
