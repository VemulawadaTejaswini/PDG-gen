import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] P = new int[N + 1];
            for (int i = 0; i < N; i++) {
                P[1 + i] = sc.nextInt();
            }
            int[] indexOf = new int[N + 1];
            for (int i = 0; i < N + 1; i++) {
                indexOf[P[i]] = i;
            }

            IntSetBIT indexSet = new IntSetBIT(N + 3);
            indexSet.add(-1 + 1);
            indexSet.add(-1 + 1);
            indexSet.add(N + 1);
            indexSet.add(N + 1);

            int sum = 0;
            for (int n = N; n >= 1; n--) {
                int index = indexOf[n];
                indexSet.add(index);
                int indexIndex = indexSet.indexOf(index);
                int l2 = indexSet.get(indexIndex - 2);
                int l = indexSet.get(indexIndex - 1);
                int r = indexSet.get(indexIndex + 1);
                int r2 = indexSet.get(indexIndex + 2);
                sum += n * (index - l) * (r2 - r);
                sum += n * (l - l2) * (r - index);
            }

            System.out.println(sum);
        }
    }
}

class IntSetBIT {
    private static final int EMPTY = -1;
    int[] sum;
    int size;

    public IntSetBIT(int n) {
        if (n <= 1)
            n = 2;
        n = Integer.highestOneBit(n - 1) << 1;
        sum = new int[n + 1];
    }

    public void clear() {
        Arrays.fill(sum, 0);
        size = 0;
    }

    public void add(int value) {
        add(value, 1);
    }

    private void add(int value, int number) {
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] += number;
        }
        size += number;
    }

    public void remove(int value) {
        remove(value, 1);
    }

    private void remove(int value, int number) {
        number = Math.min(number, size(value));
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] -= number;
        }
        size -= number;
    }

    public int get(int index) {
        int s = 0;
        for (int i = sum.length / 2; i > 0; i >>= 1) {
            if (sum[s | i] <= index) {
                s |= i;
                index -= sum[s | i];
            }
        }
        return s;
    }

    public int indexOf(int value) {
        if (size(value) == 0) {
            return EMPTY;
        }
        return sum(value + 0);
    }

    public int sum(int indexExclusive) {
        return sum1(1 + indexExclusive - 1);
    }

    private int sum1(int indexInclusive) {
        int ret = 0;
        for (int x = indexInclusive; x > 0; x -= x & -x) {
            ret += sum[x];
        }
        return ret;
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    public int size() {
        return size;
    }

    public int size(int value) {
        return sum(value + 1) - sum(value);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(get(i));
        }
        sb.append("}");
        return sb.toString();
    }
}
