import java.io.*;
import java.util.*;

public class Main {

    public static boolean match(int[] c1, int[] c2, int mask, int fix, int n) {
        int[] count = new int[26];
        for (int i = 0; i < c1.length; i++) {
            if (((1 << i) & mask) != 0) {
                count[c1[i]]++;
            } else if (i != fix){
                count[c2[i]]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        for (int i = 0; i < c1.length; i++) {
            if (((1 << i) & mask) != 0) {
                count[c2[i]]++;
            } else if (i != fix){
                count[c1[i]]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        if (fix != -1) {
            return c1[fix] == c2[fix];
        }
        return true;
    }

    public static boolean bobo(int[][] c, int mask, int fix, int n) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                graph[i][j] = graph[j][i] = match(c[i], c[j], mask, fix, n) ? 1: 0;
            }
        }
        return canMatch(graph, 0, n, 0, n % 2 == 1 ? 1 : 0);
    }

    public static boolean canMatch(int[][] graph, int usedMask, int n, int at, int selfMatch) {
        if (at == n) return true;
        for (int i = 0; i < n; i++) {
            if (((1 << i) & usedMask) == 0) {
                if (graph[at][i] != 0) {
                    if (at != i) {
                        int nextChoose = 0;
                        int nextMask = usedMask | (1 << at) | (1 << i);
                        while (((1 << nextChoose) & nextMask) != 0) nextChoose++;
                        if (canMatch(graph, nextMask, n, nextChoose, selfMatch)) return true;
                    } else if (selfMatch == 1) {
                        int nextChoose = 0;
                        int nextMask = usedMask | (1 << at) | (1 << i);
                        while (((1 << nextChoose) & nextMask) != 0) nextChoose++;
                        if (canMatch(graph, nextMask, n, nextChoose, 0)) return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                c[i][j] = s.charAt(j) - 'a';
            }
        }
        if (m % 2 == 0) {
            for (int i = 0; i < 1 << m; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (((1 << j) & i) != 0) count++;
                }
                if (count == m / 2) {
                    if (bobo(c, i, -1, n)) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");return;
        } else {
            for (int fix = 0; fix < m; fix++) {
                for (int i = 0; i < 1 << m; i++) {
                    int count = 0;
                    for (int j = 0; j < m; j++) {
                        if (((1 << j) & i) != 0 && j != fix) count++;
                    }
                    if (count == m / 2) {
                        if (bobo(c, i, fix, n)) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
            System.out.println("NO");return;
        }
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}