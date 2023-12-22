import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt() - 1;
        int u = sc.nextInt() - 1;
        int a[] = new int[n];
        int b[] = new int[n];
        int map[][] = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            map[a[i]][b[i]] = 1;
            map[b[i]][a[i]] = 1;
        }
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        ArrayDeque<Integer> sta = new ArrayDeque<>();
        sta.add(u);
        S: while (!sta.isEmpty()) {
            int pos = sta.peekLast();
            // System.out.println("pos:" + pos);
            if (pos == v) {
                // System.out.println("1");
                break;
            }
            for (int i = 0; i < n - 1; i++) {
                // System.out.println("2");
                if (!visited[i] && map[pos][i] == 1) {
                    sta.add(i);
                    // System.out.println("add:" + i);
                    visited[i] = true;
                    continue S;
                }
            }
            sta.pollLast();
        }
        // stackに経路が乗っている
        int len = sta.size();
        // System.out.println("len : " + len);
        int l = len / 2;
        int left = v;
        for (int i = 0; i < l; i++) {
            left = sta.pollFirst();
        }
        int right = sta.pollFirst();

        // System.out.println("left : " + left + ": right : " + right);

        int toCenter = (len - 2) / 2;
        // 切断する
        // leftからDSする
        map[left][right] = 0;
        map[right][left] = 0;
        sta = new ArrayDeque<>();

        Arrays.fill(visited, false);
        sta.clear();
        sta.add(left);

        int ans = 0;
        int dis[] = new int[n];
        dis[left] = 1;
        visited[left] = true;
        while (!sta.isEmpty()) {
            int pos = sta.pollFirst();
            for (int i = 0; i < n - 1; i++) {
                if (!visited[i] && map[pos][i] == 1) {
                    visited[i] = true;
                    sta.add(i);
                    dis[i] = dis[pos] + 1;
                }

            }
        }
        for (int i = 0; i < dis.length; i++) {
            ans = Math.max(ans, dis[i]);
        }

        if (ans == 1) {
            if (len == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            if (len % 2 == 0 && ans % 2 == 0) {
                ans--;
            }
            System.out.println(ans + toCenter);
        }
        // System.out.println("ans : " + ans + "toccneter" + toCenter);
        sc.close();
    }
}
