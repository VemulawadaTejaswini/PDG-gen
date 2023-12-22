import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][][] aa = new int[n][][];
        for (int i = 0; i < n; i++) {
            int acount = Integer.parseInt(sc.nextLine());
            aa[i] = new int[acount][];
            for (int j = 0; j < acount; j++) {
                String[] temp = sc.nextLine().split(" ");
                aa[i][j] = new int[2];
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                aa[i][j][0] = x - 1;
                aa[i][j][1] = y;
            }
        }

        int ans = 0;

        for (int i = 0; i < Math.pow(2, n); i++) {
            String s = "";
            int[] fa = new int[n];
            int scount = n;
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    fa[j] = 1;
                    scount--;
                }
            }
            int[] qa = new int[n];
            for (int o = 0; o < aa.length; o++) {
                if (fa[o] == 1)
                    continue;
                for (int p = 0; p < aa[o].length; p++) {
                    if (aa[o][p][1] == 0) {
                        qa[aa[o][p][0]] = 1;
                    }
                }
            }
            boolean ok = true;
            for (int l = 0; l < fa.length; l++) {
                if (fa[l] != qa[l]) {
                    ok = false;
                }
            }

            if (ok) {
                if (ans < scount) {
                    ans = scount;
                }
            }
        }

        System.out.println(ans);
    }
}