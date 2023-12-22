import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        List<Work> works = new ArrayList<>();

        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//            B[i] = sc.nextInt();
            works.add(new Work(sc.nextInt(), sc.nextInt()));
        }

        works.sort(Work::compareTo);

        int time = 0;
        for (Work w : works) {
            time += w.cost;
            if (time > w.deadline) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

//        for (Work w : works) {
//            System.out.println(w.cost + " " + w.deadline);
//        }
    }

    private static class Work implements Comparable {

        private final int cost, deadline;

        Work(int cost, int deadline) {
            this.cost = cost;
            this.deadline = deadline;
        }

        @Override
        public int compareTo(Object o) {
            Work w = (Work) o;

            if (deadline != w.deadline) {
                return deadline - w.deadline;
            }

            return w.cost - cost;
        }
    }
}
