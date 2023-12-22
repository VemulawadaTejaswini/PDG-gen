import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> ps = new ArrayDeque<>(k);
        ArrayDeque<Integer> cur = new ArrayDeque<>(k);
        double max = 0;
        double cMax = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();

            if (cur.size() == k) {
                int t = cur.poll();
                cMax -= t;
            }
            cur.add(p);
            cMax += p;

            if (cMax > max) {
                ps = cur.clone();
                max = cMax;
            }
        }

        double sum = 0.0;
        int size = ps.size();
        for (int i = 0; i < size; i++) {
            int t = ps.poll();
            double ex = (t + 1) / 2.0;
            sum = sum + ex;
        }

        System.out.println(sum);
    }
}