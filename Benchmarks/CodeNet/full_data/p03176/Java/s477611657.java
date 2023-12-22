import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author f-morozov
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] heights = new int[count];
        int[] values = new int[count];
        for (int i = 0; i < count; ++i) {
            heights[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; ++i) {
            values[i] = scanner.nextInt();
        }

        FenwickTree fenwickTree = new FenwickTree(count);

        for (int i = 0; i < count; ++i) {
            long value = fenwickTree.max(heights[i] - 1) + values[i];
            fenwickTree.update(heights[i] - 1, value);
        }
        System.out.println(fenwickTree.max(count - 1));
    }

    public static class FenwickTree {
        private final List<Long> values;

        public FenwickTree(int size) {
            this.values = new ArrayList<>(Collections.nCopies(size, 0L));
        }

        long max(int right) {
            long result = 0;
            for (int i = right; i >= 0; i = (i & (i + 1)) - 1) {
                result = Math.max(result, values.get(i));
            }
            return result;
        }

        void update(int pos, long value) {
            for (int i = pos; i < values.size(); i = i | (i + 1)) {
                values.set(i, Math.max(values.get(i), value));
            }
        }
    }
}
