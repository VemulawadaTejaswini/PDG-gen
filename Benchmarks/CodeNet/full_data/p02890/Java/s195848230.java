import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Distinct Numbers
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int a : A) {
                Integer c = map.get(a);
                c = c == null ? 1 : c + 1;
                map.put(a, c);
            }

            System.out.println(N);

            StringBuilder sb = new StringBuilder();

            Integer[] array = new Integer[N];
            for (int n = 2; n <= N; n++) {
                PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
                queue.addAll(map.values());

                int c = 0;
                while (true) {
                    int i;
                    for (i = 0; i < n; i++) {
                        Integer poll = queue.poll();
                        if (poll == null || poll == 0) {
                            break;
                        }
                        array[i] = poll;
                    }

                    if (i != n) {
                        break;
                    }

                    for (i = 0; i < n; i++) {
                        queue.add(array[i] - 1);
                    }

                    c++;
                }

                sb.append(c).append("\n");
            }

            System.out.print(sb.toString());
        }
    }

}
