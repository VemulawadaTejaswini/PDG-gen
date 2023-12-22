import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] td = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                td[i][j] = sc.nextInt();
            }
        }
        long ans = solve(n, k, td);
        System.out.println(ans);

    }

    private static long solve(int n, int k, int[][] td) {
        Main main = new Main();

        Queue<Pair> q = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Pair> old = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            Pair p = main.new Pair(td[i][0], td[i][1]);
            q.add(p);
        }

        long ans = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < k; i++) {
            Pair p = q.poll();
            ans += p.delicious;
            s.add(p.typeNum);
            old.add(p);
        }
        long bounus = s.size() * s.size();
        ans += bounus;

        int qLimit = q.size();
        long[] ansarr = new long[k];
        for (int i = 0; i < qLimit; i++) {
            Pair p = q.poll();
            if (s.contains(p.typeNum)) {
                continue;
            }

            long d = p.delicious;
            s.add(p.typeNum);
            long bias = s.size() * s.size();
            long tmp = ans - old.poll().delicious - bounus + bias + d;
            bounus = bias;
            // System.out.printf("ans%s tmp%s \n", ans, tmp);
            ansarr[i] = tmp;
        }


        for (int i = 0; i < k; i++) {
            ans = Math.max(ans, ansarr[i]);
        }
        return ans;
    }

    class Pair implements Comparable<Pair> {
        int typeNum;
        int delicious;

        Pair(int t, int d) {
            this.typeNum = t;
            this.delicious = d;
        }

        @Override
        public int compareTo(Pair o) {
            return this.delicious - o.delicious;
        }

        @Override
        public String toString() {
            return String.format("%s:%s", this.typeNum, this.delicious);
        }
    }
}
