import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int map[][] = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            map[a[i]][b[i]] = 1;
            map[b[i]][a[i]] = 1;
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        stack.push(0);
        visited[0] = true;
        A: while (!stack.isEmpty()) {
            int pos = stack.peekFirst();
            if (pos == n - 1)
                break A;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && map[pos][i] == 1) {
                    stack.push(i);
                    visited[i] = true;
                    continue A;
                }
            }
            stack.pop();
        }

        int dis = stack.size();

        int left = (dis + 1) / 2;

        int lPos = 0;

        for (int i = 0; i < left; i++) {
            lPos = stack.pollLast();
        }
        int rPOs = stack.pollLast();

        map[lPos][rPOs] = 0;
        map[rPOs][lPos] = 0;

        ArrayDeque<Integer> lstack = new ArrayDeque<>();
        ArrayDeque<Integer> rstack = new ArrayDeque<>();

        lstack.push(lPos);
        rstack.push(rPOs);

        int rcount = 0;
        rcount++;
        while (!rstack.isEmpty()) {
            int pos = rstack.poll();
            for (int i = 0; i < n; i++) {
                if (map[pos][i] == 1) {
                    map[pos][i] = 0;
                    map[i][pos] = 0;
                    rstack.push(i);
                    rcount++;
                }
            }
        }
        int lcnt = 0;
        while (!lstack.isEmpty()) {
            int pos = lstack.poll();
            for (int i = 0; i < n; i++) {
                if (map[pos][i] == 1) {
                    map[pos][i] = 0;
                    map[i][pos] = 0;
                    lstack.push(i);
                    lcnt++;
                }
            }
        }

        if (dis % 2 == 0) {
            // lスタート
            rcount++;
        } else {
            // rスタート
        }
        if (lcnt > rcount) {
            System.out.println("Fennec");
        } else {
            System.out.println("Snuke");
        }

        sc.close();
    }
}
