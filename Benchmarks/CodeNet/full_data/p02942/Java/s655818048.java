import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;

    //
//
//





    static {
//        int kk = 100;
//
//        StringBuilder sb = new StringBuilder(String.format("%s %s ", kk, kk));
//        int [] d = new int[kk * kk];
//        for(int s = 0 ; s < d.length ; s++) {
//            d[s] = s + 1;
//        }
//        Random r = new Random();
//        for(int s = d.length - 1 ; s >= 0 ; s--) {
//            int l = r.nextInt(s + 1);
//            if (s != l) {
//                int k = d[s];
//                d[s] = d[l];
//                d[l] = k;
//            }
//            if (s % kk == kk - 1) {
//                sb.append('\n');
//            }
//            sb.append(d[s]).append(" ");
//        }
//        sb.append("\n\n");
//
//
//        System.out.println(sb);




        sc = new Scanner(System.in);
    }
//    static {
//        sc = new Scanner("5 5 \n" +
//                "20 23 12 18 2 \n" +
//                "19 14 17 6 9 \n" +
//                "24 15 13 16 10 \n" +
//                "4 1 8 3 5 \n" +
//                "11 7 21 22 25 ");
//
//    }
//    static Scanner sc = new Scanner("5\n" +
//            "5 3\n" +
//            "4 1\n" +
//            "9 1\n" +
//            "2 1\n" +
//            "5 4\n" +
//            "1 1\n" +
//            "8 2\n" +
//            "3 2\n" +
//            "6 1\n" +
//            "12 6\n" +
//            "15 2\n" +
//            "22 1\n" +
//            "4 2\n" +
//            "14 1\n" +
//            "23 1\n" +
//            "19 2\n" +
//            "53 9\n" +
//            "7 1\n" +
//            "19 1\n" +
//            "23 2\n" +
//            "40 2\n" +
//            "54 2\n" +
//            "81 1\n" +
//            "85 2\n" +
//            "94 1\n" +
//            "102 1\n" +
//            "8128376 30\n" +
//            "259694 2\n" +
//            "10267200 2\n" +
//            "591548 2\n" +
//            "5755696 2\n" +
//            "4307513 2\n" +
//            "5863522 2\n" +
//            "10040589 1\n" +
//            "2234412 1\n" +
//            "5086932 1\n" +
//            "14706276 1\n" +
//            "15430629 2\n" +
//            "2150128 2\n" +
//            "14561793 1\n" +
//            "7991506 2\n" +
//            "824138 2\n" +
//            "3450600 2\n" +
//            "6482303 1\n" +
//            "11413148 1\n" +
//            "12215231 2\n" +
//            "7578498 1\n" +
//            "13184008 2\n" +
//            "6684996 1\n" +
//            "11579040 1\n" +
//            "2662824 1\n" +
//            "13334004 2\n" +
//            "5954542 1\n" +
//            "7364389 1\n" +
//            "8028062 1\n" +
//            "11858536 1\n" +
//            "15223536 2");


    static int ni() {
        return sc.nextInt();
    }

    static int[] nia(int l) {
        int[] r = new int[l];
        for (int s = 0; s < l; s++) {
            r[s] = ni();
        }
        return r;
    }


    public static void main(String[] args) {
        boolean multi = false;

        if (multi) {
            int n = ni();
            for (int i = 0; i < n; i++) {
                solve(i + 1);
            }
        } else {
            solve(1);
        }

    }


    private static void solve(int csn) {
        int n = ni();
        int m = ni();
        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = ni() - 1;
            }
        }


        for (int tt = 0; tt < m - 1 ; tt++) {

            ArrayList<int []> edges = new ArrayList<>();
            int len = 2 + n + n + n * m;
            for (int s = 0 ; s < n ; s++) {
                edges.add(new int[]{0, s+1});
                edges.add(new int[]{len - 1 - s - 1, len - 1});
            }

            for (int i = 0 ; i < n ; i++) {
                for (int j = tt ; j < m ; j++) {
                    edges.add(new int[]{i + 1, i * m + j + n + 1});
                    edges.add(new int[]{i * m + j + n + 1, 1 + n + n * m + data[i][j] / m});
                }
            }

            Max1CostFlow r = new Max1CostFlow(len, edges);
            if (r.cost() != n) {
                throw new IllegalStateException(r.cost() + "");
            }


            for (int s = 0 ; s < n ; s++) {
                for (int l : r.edges_n[s + 1]) {
                    if (r.edges[l][2] == 0 && r.edges[l][1] != 0) {
                        int j = (r.edges[l][1] - n - 1) % m;
                        int x = data[s][j];
                        data[s][j] = data[s][tt];
                        data[s][tt] = x;
                    }
                }
            }
//            System.out.println("-------");
//            printArray(data);
        }

        printArray(data);
        int[][] nd = new int[n][m];

        for (int s = 0; s < n; s++) {
            for (int i = 0; i < m; i++) {
                nd[data[s][i] / m][i] = data[s][i];
            }
        }
        printArray(nd);

    }

    private static void printArray(int[][] nd) {
        for (int[] k : nd) {
            for (int i : k) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    private static void update(boolean[][] contains, int[] ints) {
        for (int s = 0; s < ints.length; s++) {
            contains[s][ints[s] / ints.length] = true;
        }
    }


    private static final int[] inn(int n) {
        int[] data = new int[n];
        Arrays.fill(data, -1);
        return data;
    }

    private static final int max(int[] n) {
        int max = 0;
        for (int i : n) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static final class Max1CostFlow {
        private int n;
        int [][] edges_n;
        int [][] edges;
        int cost = 0;

        public Max1CostFlow(int n, ArrayList<int[]> edges) {
            this(n, edges.toArray(new int[0][0]));
        }

        public Max1CostFlow(int n,int[][] source) {
            edges = new int[source.length * 2][];
            this.n = n;
            int[] ec_n = new int[n];
            for (int[] s : source) {
                ec_n[s[0]]++;
                ec_n[s[1]]++;
            }
            edges_n = new int[n][];
            for (int s = 0; s < n; s++) {
                edges_n[s] = new int[ec_n[s]];
            }
            for (int i = 0 ; i < source.length ; i++) {
                int [] s = source[i];
                edges[i * 2] = new int[]{s[0], s[1], 1};
                edges[i * 2 + 1] = new int[]{s[1], s[0], 0};
                edges_n[s[0]][--ec_n[s[0]]] = i * 2;
                edges_n[s[1]][--ec_n[s[1]]] = i * 2 + 1;
            }
        }

        private int cost() {
            boolean [] visited = new boolean[n];
            boolean found = true;
            while (found) {
                found = false;
                Arrays.fill(visited, false);
                visited[0] = true;
                while (dfs(0, visited)) {
                    found = true;
                    visited[0] = false;
                    visited[n - 1] = false;
                    cost++;
                }
            }

            return cost;
        }

        private boolean dfs(int i, boolean[] visited) {
            for (int eNum : edges_n[i]) {
                int [] edge = edges[eNum];
                if (edge[2] == 0 || visited[edge[1]]) continue;
                visited[edge[1]] = true;
                if (edge[1] == n - 1 || dfs(edge[1], visited)) {
                    edges[eNum][2] ^= 1;
                    edges[eNum ^ 1][2] ^= 1;
                    return true;
                }
            }
            return false;
        }
    }

}
