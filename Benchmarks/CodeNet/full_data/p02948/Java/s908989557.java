import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Summer Vacation
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Work[] W = new Work[N];
            for (int i = 0; i < N; i++) {
                W[i] = new Work();
                W[i].A = sc.nextInt();
                W[i].B = sc.nextInt();
            }

            Arrays.sort(W, (o1, o2) -> {
                int comp = Integer.compare(o2.B, o1.B);
                if (comp == 0) {
                    comp = Integer.compare(o1.A, o2.A);
                }
                return comp;
            });

            List<Integer> schedule = new LinkedList<>();
            for (int i = 1; i <= M; i++) {
                schedule.add(i);
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                Work w = W[i];

                int pos = Collections.binarySearch(schedule, w.A);
                if (pos < 0) {
                    pos = -(pos + 1);
                }

                if (pos == schedule.size()) {
                    continue;
                }

                sum += w.B;
                schedule.remove(pos);

                if (schedule.isEmpty()) {
                    break;
                }
            }

            System.out.println(sum);
        }
    }

    public static class Work {

        public int A;

        public int B;

    }

}
