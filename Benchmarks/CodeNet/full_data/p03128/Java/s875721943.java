
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    int[] needs = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    Set<String> nums = new HashSet<>();
    int n, m, t, min;
    Set<Integer> use = new HashSet<>();

    void run() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            use.add(sc.nextInt());
        }

        this.min = 10;
        for (int u : use) {
            min = Math.min(min, needs[u]);
        }
        final int min = this.min;
        t = 0;
        for (int i = 1; i < 10; i++) {
            if (use.contains(i) && needs[i] == min) {
                t = i;
            }
        }
        debug(t, n / min, n % min);

        dfs(0, n / min, "");

        List<String> ans = nums.stream()
                .filter(num -> (n - count(num)) % min == 0)
                .sorted()
                .collect(Collectors.toList());

        debug(ans.get(ans.size() - 1));
        debug("71111111111111111111111111111111111111111111111111".length());

        int digit = n / min;
        int[] ansNum = new int[digit];
        for (int i = 0; i < digit; i++) {
            ansNum[i] = t;
        }
        String target = ans.get(ans.size() - 1);
        for (int i = 0; i < target.length(); i++) {
            ansNum[i] = target.charAt(i) - '0';
        }
        Arrays.sort(ansNum);
        for (int i = 0; i < digit; i++) {
            System.out.print(ansNum[digit - i - 1]);
        }
        System.out.println();
    }

    void dfs(int p, int dig, String num) {
        if (p == Math.min(6, dig)) {
            if (count(num) + (dig - p) * min <= n) {
                nums.add(num);
            }
            return;
        }
        for (int d : use) {
            dfs(p + 1, dig, num + d);
        }
    }

    int count(String num) {
        int len = num.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            cnt += needs[num.charAt(i) - '0'];
        }
        return cnt;
    }


    class V implements Comparable<V> {
        String num;
        int dig;

        V(String num, int dig) {
            this.num = num;
            this.dig = dig;
        }

        @Override
        public int compareTo(V o) {
            if (this.dig == o.dig) {
                return o.num.compareTo(this.num);
            }
            return this.dig - o.dig;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
