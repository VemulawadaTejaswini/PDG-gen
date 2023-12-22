import java.util.*;
import java.io.*;

public class Main {
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

    }
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

        void println(Object a) {
            out.append(a + "\n");
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int a = in.nextInt();
        int b = in.nextInt();
        if(a % 2 == 0 || b % 2 == 0){
            out.println("No");
        } else {
            out.println("Yes");
        }
        out.close();
    }
}