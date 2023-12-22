import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        int[] lights = new int[m];
        int[] p = new int[m];

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();

            int state = 0;

            for (int j = 0; j < k; j++) {
                int s = sc.nextInt();

                state += (1 << (s - 1));
            }

            lights[i] = state;
        }

        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < (1 << n); i++) {
            boolean check = true;

            for (int j = 0; j < m; j++) {
                int cond = Integer.bitCount(i & lights[j]);

                if (cond % 2 != p[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}