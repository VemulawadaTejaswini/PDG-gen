

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = null;
    int totalCases, testNum;

    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    void solve() throws IOException {

    }

    void execute() throws IOException {
        int n = ni();
        int m = ni();
        Map<Integer, List<Integer>> outDegree = new HashMap<>();
        Map<Integer, List<Integer>> intDegree = new HashMap<>();
        int[] indegreeCnt = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int v1 = ni();
            int v2 = ni();
            if (!outDegree.containsKey(v1)) {
                outDegree.put(v1, new ArrayList<>());
            }
            outDegree.get(v1).add(v2);

            if (!intDegree.containsKey(v2)) {
                intDegree.put(v2, new ArrayList<>());
            }
            intDegree.get(v2).add(v1);

            indegreeCnt[v2]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < indegreeCnt.length; i++) {
            if (indegreeCnt[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> sorted = new ArrayList<>();
        while (!queue.isEmpty()) {
            int num = queue.poll();
            sorted.add(num);
            if (outDegree.containsKey(num)) {
                for (int adj : outDegree.get(num)) {
                    if (--indegreeCnt[adj] == 0) {
                        queue.offer(adj);
                    }
                }
            }
        }

        int[] dp = new int[n + 1];
        int max = 0;
        for (int num : sorted) {
            if (intDegree.containsKey(num)) {
                for (int in : intDegree.get(num)) {
                    dp[num] = Math.max(dp[num], dp[in] + 1);
                }
            }
            max = Math.max(max, dp[num]);
        }

        out.print(max);


        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().execute();
    }

    void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String ns() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(br.readLine());
        }
        return tokenizer.nextToken();
    }

    String nline() throws IOException {
        tokenizer = null;
        return br.readLine();
    }

    boolean input() throws IOException {
        return true;
    }

}
