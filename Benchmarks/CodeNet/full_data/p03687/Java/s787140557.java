import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public void solve() throws IOException {
        char c[] = nextToken().toCharArray();
        int n = c.length;
        int gMax = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            int max = 0;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if(c[j] - 'a' != i){
                    cnt++;
                }else{
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
            }
            if(cnt <= max){
                gMax = Math.min(gMax, max);
            }else{
                gMax = Math.min(gMax, cnt);
            }
        }
        out.print(gMax);
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
//            br = new BufferedReader(new FileReader("queue.in"));
//            out = new PrintWriter(new File("queue.out"));
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