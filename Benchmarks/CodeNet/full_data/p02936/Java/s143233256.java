import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] parentList = new int[n];
        int[] cntList = new int[n];

        Arrays.fill(parentList, -1);

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            if (a < b)
                parentList[b] = a;
            else
                parentList[a] = b;
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();

            cntList[p] += x;
        }

        for (int i = 0; i < n; i++) {
            if (parentList[i] >= 0)
                cntList[i] += cntList[parentList[i]];

            pw.print(cntList[i] + " ");
        }
        pw.println();

        pw.flush();
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}