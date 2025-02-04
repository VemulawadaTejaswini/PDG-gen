import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

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
            //System.out.println(String.format("input: (%d, %d)", s[i], c[i]));
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
            //System.out.println(String.format("(%d, %d)", val, dig));

            if (dig == N && N >= 2) {
                if (val >= 1 && val <= 9) {
                    ans += val * Math.pow(10, dig - 1);
                } else {
                    ans = -1;
                    break;
                }
            } else  {
                ans += val * Math.pow(10, dig - 1);
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