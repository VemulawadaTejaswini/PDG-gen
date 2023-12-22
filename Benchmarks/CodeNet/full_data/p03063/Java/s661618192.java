import java.io.*;
import java.util.*;

public class Main {

    String fileName = "";

    void solve() throws IOException {
        int n = readInt();
        char[] a = readString().toCharArray();
        for(int i=0;i<n/2;i++){
            char tmp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = tmp;
        }
        int totalWhite = 0;
        for (int i = 0; i < n; i++) {
            totalWhite += (a[i] == '.' ? 1 : 0);
        }
        int ans = 1000_000_000;
        int leftAns = 0;
        for (int i = -1; i < n; i++) {
            if (i >= 0) {
                if (a[i] == '.') {
                    totalWhite--;
                    leftAns++;
                }
            }
            int leftSize = n - 1 - i;
            ans = Math.min(ans, leftAns + leftSize - totalWhite);
        }
        out.println(ans);
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        new Main().run();
    }

    void run() throws NumberFormatException, IOException {
        solve();
        out.close();
    }

    BufferedReader in;
    PrintWriter out;

    StringTokenizer tok;
    String delim = " ";

    Main() throws FileNotFoundException {
        try {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } catch (Exception e) {
            if (fileName.isEmpty()) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(fileName + ".out");
            }

        }
        tok = new StringTokenizer("");
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine) {
                return null;
            }

            tok = new StringTokenizer(nextLine);
        }
        return tok.nextToken(delim);
    }

    int readInt() throws NumberFormatException, IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws NumberFormatException, IOException {
        return Long.parseLong(readString());
    }

    int[] readIntArray(int n) throws NumberFormatException, IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = readInt();
        }
        return a;
    }

    double readDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(readString());
    }

    void sortIntArray(int[] a) {
        Integer[] arr = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
    }


}