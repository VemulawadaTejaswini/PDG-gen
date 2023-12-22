import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int sx = nextInt();
        int sy = nextInt();
        int tx = nextInt();
        int ty = nextInt();

        boolean[][] used = new boolean[2001][2001];

        StringBuilder sb = new StringBuilder("");

        int curx = sx;
        int cury = sy;

        while(cury < ty) {
            sb.append("D");

            ++cury;
        }


        while(curx < tx) {
            sb.append("R");
            ++curx;
        }

        sb.append("D");
        ++cury;
        while(curx >= sx) {
            --curx;
            sb.append("L");
        }
        while(cury > sy) {
            --cury;
            sb.append("U");
        }


        sb.append("R");
        curx = sx;
        cury = sy;
        sb.append("U");
        --cury;


        while(curx <= tx) {
            ++curx;
            sb.append("R");
        }
        while(cury < ty) {
            ++cury;
            sb.append("D");
        }
        sb.append("L");
        curx = tx;
        cury = ty;

        while(cury > sy) {
            --cury;
            sb.append("U");
        }
        while(curx > sx) {
            sb.append("L");
            --curx;
        }
        writer.println(sb);

    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("highcard.in"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("highcard.out");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}