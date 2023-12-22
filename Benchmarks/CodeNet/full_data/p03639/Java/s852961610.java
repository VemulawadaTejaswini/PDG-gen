import java.io.*;
import java.util.*;

public class Main {

    public void solve() throws IOException {
        int n = nextInt();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            if(x % 4 == 0){
                cnt1++;
            }else if(x % 4 != 2){
                cnt2++;
            }
        }
        if(cnt1 >= cnt2 || (cnt2 == cnt1 + 1 && cnt1 + cnt2 == n)){
            out.print("Yes");
        }else{
            out.print("No");
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