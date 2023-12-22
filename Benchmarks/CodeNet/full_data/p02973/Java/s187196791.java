import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println(func2(N, A));
        }
    }

    public static int func2(int N, int[] A) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = N - 1; i >= 0; i--) {
            if (list.isEmpty() || list.getLast() <= A[i]) {
                list.add(A[i]);
                continue;
            }

            int higherIndex = higher(list, A[i], 0, list.size());
            list.remove(higherIndex);
            list.add(higherIndex, A[i]);
        }

        return list.size();
    }

    public static int higher(LinkedList<Integer> list, int value, int start, int end) {
        if (end - start == 1) {
            return start;
        }

        int center = (start + end) / 2;
        if (list.get(center - 1) <= value) {
            return higher(list, value, center, end);
        } else {
            return higher(list, value, start, center);
        }
    }

}
