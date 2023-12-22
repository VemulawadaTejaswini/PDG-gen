import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public void solve() throws IOException {
        int H = nextInt(), W = nextInt(), h = nextInt(), w = nextInt();
        if(H % h == 0 && W % w == 0){
            out.print("No");
            return;
        }else out.println("Yes");
        int min = ((h * w - 1) * 4000 + 1) * (-1);
        int res[][] = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                res[i][j] = 4000;
            }
        }
        for(int i = 0; i < H / h; i++){
            for(int j = 0; j < W / w; j++){
                res[(i + 1) * h - 1][(j + 1) * w - 1] = min;
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
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