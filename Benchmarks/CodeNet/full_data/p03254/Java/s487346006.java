import java.io.*;
import java.util.*;

public class Main {
    static class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    static class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        long x = in.nextLong();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextLong());
        }
        Collections.sort(a);
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < n && sum < x; i++) {
            if(sum + a.get(i) <= x){
                sum += a.get(i);
                ans++;
            } else {
                break;
            }
        }
        if(ans == n && x > sum){
            ans = Math.max(ans - 1, 0);
        }
        out.print(ans);
        out.close();
    }
}