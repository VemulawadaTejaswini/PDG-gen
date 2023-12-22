import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int d[] = new int[13];
        for (int i = 0; i < n; i++) {
            d[sc.nextInt()]++;
        }

        if (d[0] >= 1 || d[12] >= 2 || Arrays.stream(d).anyMatch(cnt -> cnt >= 3)) {
            System.out.println(0);
            return;
        }

        int len = 0;
        int one[] = new int[12];
        boolean time[] = new boolean[24];
        for (int i = 0; i <= 12; i++) {
            if (d[i] == 2) {
                time[d[i]] = true;
                time[(24 - d[i]) % 24] = true;
            } else if (d[i] == 1) {
                one[len++] = i;
            }
        }
        time[0] = true;

        int ans = 0;
        for (int i = 0; i < (1 << len); i++) {
            boolean tmp[] = new boolean[24];
            for (int j = 0; j < 24; j++) {
                tmp[j] = time[j];
            }
            for (int j = 0; j < len; j++) {
                if ((i >> j) % 2 == 0) {
                    tmp[one[j]] = true;
                } else {
                    tmp[24 - one[j]] = true;
                }
            }
            ans = Math.max(ans, calc(tmp));
        }

        System.out.println(ans);
    }

    private int calc(boolean time[]) {
        int prv = 0;
        int ans = 25;
        for (int i = 1; i < 24; i++) {
            if (time[i]) {
                ans = Math.min(ans, i - prv);
                prv = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
