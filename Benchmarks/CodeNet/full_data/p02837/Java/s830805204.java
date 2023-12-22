import java.util.*;

public class Main {

    static class Pair<U, V> {
        public final U first;   	// first field of a Pair
        public final V second;  	// second field of a Pair

        // Constructs a new Pair with specified values
        public Pair(U first, V second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        // Checks specified object is "equal to" current object or not
        public boolean equals(Object o)
        {
            if (this == o)
                return true;

            if (o == null || getClass() != o.getClass())
                return false;

            lib.others.Pair<?, ?> pair = (lib.others.Pair<?, ?>) o;

            // call equals() method of the underlying objects
            if (!first.equals(pair.first))
                return false;
            return second.equals(pair.second);
        }

        @Override
        // Computes hash code for an object to support hash tables
        public int hashCode()
        {
            // use hash codes of the underlying objects
            return 31 * first.hashCode() + second.hashCode();
        }

        @Override
        public String toString()
        {
            return "(" + first + ", " + second + ")";
        }

        // Factory method for creating a Typed Pair immutable instance
        public static <U, V> lib.others.Pair<U, V> of(U a, V b)
        {
            // calls private constructor
            return new lib.others.Pair<>(a, b);
        }
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Pair>> li = new ArrayList<>();
        for (int i = 0; i < n; ++i) li.add(new ArrayList<>());

        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            for (int j = 0; j < a; ++j) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                li.get(i).add(new Pair(--x, y));
            }
        }

        int res = 0;
        for (int bit = 0; bit < (1<<n); ++bit) {
            boolean flag = true;
            for (int i = 0; i < n; ++i) {
                if (!((bit & (1<<i)) != 0)) continue;

                for (Pair p : li.get(i)) {
                    int x = (int)p.first;
                    int y = (int)p.second;

                    if (y == 1 && !((bit & (1<<x)) != 0)) flag = false;
                    if (y == 0 && ((bit & (1<<x)) != 0)) flag = false;
                }
                if (!flag) break;
            }
            if (flag)
                res = Math.max(res, countSetBits(bit));
        }

        System.out.println(res);
    }
}