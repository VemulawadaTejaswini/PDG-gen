import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] hn = new int[n];
        for (int i = 0; i < n; i++) {
            hn[i] = sc.nextInt();
        }

        int ans = solve(n, a, b, hn);
        System.out.println(ans);
    }

    static int solve(int n, int a, int b, int[] hn) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            q.add(hn[i]);
        }

        int ans = 0;
        Queue<Integer> tmpq = new PriorityQueue<>(Comparator.reverseOrder());
        while (!q.isEmpty()) {
            int qsize = q.size();
            for (int i = 0; i < qsize; i++) {
                int hp = q.poll();
                if (i == 0) {
                    hp -= a;
                } else {
                    hp -= b;
                }

                if (hp > 0) {
                    tmpq.add(hp);
                }
            }
            ans++;
            q.addAll(tmpq);
            tmpq.clear();
        }

        return ans;
    }
}

