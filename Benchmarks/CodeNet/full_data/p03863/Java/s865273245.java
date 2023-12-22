import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main implements Runnable {

    private void solve() throws IOException {

        String s = reader.readLine();
        if((s.length() % 2 == 0)) {
            if(s.charAt(0) != s.charAt(s.length()-1)) writer.println("Second");
        } else if((s.length() % 2 != 0)) {
            if(s.charAt(0) == s.charAt(s.length()-1)) writer.println("Second");
        } else writer.println("First");
    }


    public static void main(String[] args) {

        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//             reader = new BufferedReader(new FileReader("input.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
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

    String nextToken() throws IOException {
        while(tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }
}
