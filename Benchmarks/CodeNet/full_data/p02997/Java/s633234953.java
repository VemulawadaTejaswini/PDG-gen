import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (k > ((n-2)*(n-1))/2) {
            System.out.println("-1");
            return;
        }

        ArrayList<String> res = new ArrayList<>();

        boolean[][] adj = new boolean[n+1][n+1];
        for (int i = 2; i <= n; i++) {
            adj[i][1] = true;
            adj[1][i] = true;
            res.add("1 " + i);
        }

        int cur = ((n-2)*(n-1))/2;
        System.out.println(cur);
        if (cur > k) {
            outer: for (int i = 2; i <= n; i++) {
                for (int j = 2; j <= n; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (!adj[i][j]) {
                        adj[i][j] = true;
                        adj[j][i] = true;
                        cur--;
                        res.add(i + " " + j);
                    }
                    if (cur == k) {
                        break outer;
                    }
                }
            }
        }

        System.out.println(res.size());
        for (String string : res) {
            System.out.println(string);
        }
    }

}
/*

 */