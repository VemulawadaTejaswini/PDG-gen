import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
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

    int[][] all;
    void findMax(HashSet<Integer> visited, int row, int n) {
        int i =row;
        if(visited.contains(row))
            return;
        visited.add(row);
        for(int j=1;j<=n;j++){
            if(all[i][j]==0)
                continue;
            if(!visited.contains(j)){
                findMax(visited, j, n);
            }
            int max = 0;
            for(int k=1;k<=n;k++)
                if(all[j][k]>max)
                    max=all[j][k];
            all[i][j]=max+1;
        }
    }
    void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        HashSet<Integer> visited = new HashSet<>();
        all = new int[n+1][n+1];

        for(int i=0;i<m;i++){
            all[readInt()][readInt()]=1;
        }
        for(int i=1;i<=n;i++)
            findMax(visited, i, n);
        int max = 0;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                if(all[i][j]>max)
                    max=all[i][j];
        System.out.println(max);
    }
}
