import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int pow(int x, int n) {
        int ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) ans = ans * x;
            x = x * x;
            n = n >> 1;
        }
        return ans;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        int[] c = new int[M];

        Map<Integer, Integer> rules = new HashMap<>();
        for (int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            if (rules.containsKey(s[i])) {
                int v = rules.get(s[i]);
                if (v == c[i]) {
                    // ok
                } else {
                    System.out.println("-1");
                    return;
                }
            } else {
                rules.put(s[i], c[i]);
            }
        }

        boolean[] generated = new boolean[N];
        int ans = 0;
        for (Map.Entry e : rules.entrySet()) {
            int dig = N - (Integer)e.getKey() + 1;
            int val = (Integer)e.getValue();
            int x3 = -1;

            if (dig == N && N >= 2) {
                if (val >= 1 && val <= 9) {
                    x3 = val * pow(10, dig - 1);
                    ans += x3;
                } else {
                    ans = -1;
                    break;
                }
            } else  {
                x3 = val * pow(10, dig - 1);
                ans += x3;
            }
            generated[dig - 1] = true;
        }

        if (ans != -1) {
            for (int i = N - 1; i >= 0; i--) {
                if (!generated[i] && i == N -1) ans+= 1 * Math.pow(10, i);
            }
        }

        System.out.println(ans);
        return;
    }

}