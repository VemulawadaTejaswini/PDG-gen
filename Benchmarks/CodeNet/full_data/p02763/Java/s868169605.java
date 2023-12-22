import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDistinctCharactersQueries solver = new DDistinctCharactersQueries();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class DDistinctCharactersQueries {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            TreeSet<Integer>[] sets = new TreeSet[26];
            for (int i = 0; i < 26; i++)
                sets[i] = new TreeSet<>();
          	int length=sc.nextInt();
            char[] arr = sc.next().toCharArray();
            for (int i = 0; i < arr.length; i++) {
                sets[arr[i] - 'a'].add(i);
            }
            int n = sc.nextInt();
            while (n-- > 0) {
                int q = sc.nextInt();
                if (q == 1) {
                    int idx = sc.nextInt() - 1;
                    sets[arr[idx] - 'a'].remove(idx);
                    char c = sc.next().charAt(0);
                    sets[c - 'a'].add(idx);
                    arr[idx] = c;
                } else {
                    int count = 0;
                    int l = sc.nextInt() - 1, r = sc.nextInt() - 1;
                    for (int i = 0; i < 26; i++) {
                        if (sets[i].floor(r) != null && sets[i].floor(r) >= l)
                            count++;
                    }
                    pw.println(count);
                }
            }
        }
 
    }
 
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
 