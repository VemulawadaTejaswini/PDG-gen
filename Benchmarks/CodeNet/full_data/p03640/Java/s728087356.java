import java.io.*;
import java.util.*;

public class Main {

    public void solve() throws IOException {
        int h = nextInt(), w = nextInt();
        int res[][] = new int[h][w];
        int n = nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if(c[cnt] != 0){
                        c[cnt]--;
                        res[i][j] = cnt + 1;
                    }else{
                        cnt++;
                        c[cnt]--;
                        res[i][j] = cnt + 1;
                    }
                }
            }else {
                for (int j = w - 1; j >= 0; j--) {
                    if(c[cnt] != 0){
                        c[cnt]--;
                        res[i][j] = cnt + 1;
                    }else{
                        cnt++;
                        c[cnt]--;
                        res[i][j] = cnt + 1;
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                out.print(res[i][j] + " ");
            }
            out.println();
        }
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("sum2.in"));
//            out = new PrintWriter(new File("sum2.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}