import java.util.Scanner;

public class Main {
    char[] cs;
    int n;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
        n = cs.length;
    }

    private void solve() {
        int clen = 'z' - 'a' + 1;
        int[][] cnts = new int[n+1][clen];
        for (int i = 1; i < cnts.length; i++) {
            for (int j = 0; j < clen; j++) {
                cnts[i][j] = cnts[i-1][j];
            }
            cnts[i][cs[i-1] - 'a']++;
        }
        int ans = 0;
        int end = n;
        while (end > 0) {
            for (int st = 0; st < end; st++) {
                if (check(cnts[end], cnts[st], end - st)) {
                    end = st;
                    break;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }

    private boolean check(int[] trg, int[] diff, int len) {
        boolean ret;
        if (len % 2 == 0) {
            ret = true;
            for (int i = 0; i < trg.length; i++) {
                int tmp = trg[i] - diff[i];
                ret &= tmp % 2 == 0;
            }
        }
        else {
            int cnt = 0;
            for (int i = 0; i < trg.length; i++) {
                int tmp = trg[i] - diff[i];
                if (tmp % 2 == 1)
                    cnt++;
            }
            ret = cnt == 1;
        }
        return ret;
    }
}
