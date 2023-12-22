import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(reader.readLine());
            }

            PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });

            for (int i = N - 1; i >= 0; i--) {
                Integer peek = queue.peek();
                if (peek == null || A[i] >= peek) {
                    queue.add(A[i]);
                } else {
                    queue.remove(peek);
                    queue.add(A[i]);
                }
            }

            System.out.println(queue.size());
        }
    }

}
