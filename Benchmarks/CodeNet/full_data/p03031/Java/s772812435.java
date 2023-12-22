import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] adj;
    static int[] p;
    static int switches, bulbs, res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        switches = Integer.parseInt(st.nextToken());
        bulbs = Integer.parseInt(st.nextToken());

        adj = new boolean[11][11];
        p = new int[11];

        for (int i = 1; i <= bulbs; i++) {
            st = new StringTokenizer(in.readLine());
            int k = Integer.parseInt(st.nextToken());

            for (int j = 0; j < k; j++) {
                int s = Integer.parseInt(st.nextToken());
                adj[s][i] = true;
            }
        }

        st = new StringTokenizer(in.readLine());
        for (int i = 1; i <= bulbs; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, new int[switches]);

        System.out.println(res);
    }

    static void recur(int depth, int[] arr) {
        if (depth == switches) {
            int[] add = new int[bulbs+1];
            for (int i = 0; i < switches; i++) {
                if (arr[i] == 1) {
                    for (int j = 1; j <= bulbs; j++) {
                        if (adj[i+1][j]) {
                            add[j]++;
                        }
                    }
                }
            }

            boolean ok = true;
            for (int i = 1; i <= bulbs; i++) {
                if (p[i]%2 != add[i]%2) {
                    ok = false;
                }
            }

            if (ok) {
                res++;
            }
            return;
        }
        recur(depth+1, Arrays.copyOf(arr, switches));
        int[] copy = Arrays.copyOf(arr, switches);
        copy[depth] = 1;
        recur(depth+1, copy);
    }
}
/*
2 3
2 1 2
1 1
1 2
0 0 1


 */