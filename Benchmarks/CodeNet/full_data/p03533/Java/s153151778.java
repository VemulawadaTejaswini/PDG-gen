package contest;

import io.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person(in.nextInt(), in.nextInt());
        }
        Arrays.sort(persons);
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (persons[i - 1].h >= dp[i - 1][j - 1]) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1] + persons[i - 1].p);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dp[n][i] < Integer.MAX_VALUE) {
                ans = i;
            }
        }

        out.println(ans);
    }

    class Person implements Comparable<Person>{
        int h;
        int p;

        public Person(int h, int p) {
            this.h = h;
            this.p = p;
        }

        @Override
        public int compareTo(Person o) {
            return Integer.compare(h + p, o.h + o.p);
        }
    }
}

