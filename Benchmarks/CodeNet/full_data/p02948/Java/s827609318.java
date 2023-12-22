import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Work> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Work(a, b));
        }
        sc.close();

        Collections.sort(list);
//        System.out.println(list);

        List<Work> works = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            List<Work> candidates = new ArrayList<>();
            for (Work work : list) {
                if (work.a <= i) {
                    candidates.add(work);
                } else {
                    break;
                }
            }
            if (candidates.size() > 0) {
                Collections.sort(candidates, (e1, e2) -> e2.b - e1.b);
//                System.out.println(candidates);
                works.add(candidates.get(0));
                list.remove(candidates.get(0));
            }
        }
        long ans = 0;
        for (Work work : works) {
            ans += work.b;
        }
        System.out.println(ans);
    }

    public static class Work implements Comparable<Work> {
        int a;
        int b;

        public Work(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Work o) {
            return a - o.a;
//            if (o.b - b != 0) {
//                return o.b - b;
//            } else {
//                return o.a - a;
//            }
        }

        @Override
        public String toString() {
            return "a=" + a + ", b=" + b;
        }
    }
}
