
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

    int found(int[][] all, int m, int x, int y){
        for(int i=0;i<m;i++)
            if(all[i][0] == x || all[i][0] == y || all[i][1] == x || all[i][1] == y)
                continue;
            else
                return i;
        return -1;
    }

    // solution
    public static int log2(int x)
    {
        return (int) (Math.log(x) / Math.log(2));
    }

    void solve() throws IOException {
        int n = readInt();
        int[] all = new int[n];
        int[] res = new int[n];
        for(int i=0;i<n;i++)
            all[i]=readInt();
        res[0]=0;
        for(int i=1;i<n;i++){
            int cost1 = Math.abs(all[i]-all[i-1]) + res[i-1];
            int cost2 = i==1? Integer.MAX_VALUE : Math.abs(all[i]-all[i-2]) + res[i-2];
            res[i]=Math.min(cost1, cost2);
        }
        System.out.println(res[n-1]);
    }
}
