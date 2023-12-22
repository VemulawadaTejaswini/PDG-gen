import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        AtomicInteger i = new AtomicInteger();

        List<Long> as = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            as.add(sc.nextLong());
        }

        List<Guest> guests = new ArrayList<>(as.stream()
                .map(it -> new Guest(i.getAndIncrement(), it.intValue()))
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList()));

        SortedSet<Pair> pairs = new TreeSet<>(Comparator.reverseOrder());

        for (int j = 0; j < n; j++) {
            Guest a = guests.get(j);
            for (int k = 0; k < n; k++) {
                Guest b = guests.get(k);

                pairs.add(new Pair(a, b));
                pairs.add(new Pair(b, a));
            }
        }

        int result = 0;

        while (m > 0 && !pairs.isEmpty()) {
            Pair p = pairs.first();
            pairs.remove(p);
            result += p.getFirst().getValue() + p.getSecond().getValue();
            m--;
        }

        System.out.println(result);
    }

    private static class Pair implements Comparable<Pair> {
        private final Guest first;
        private final Guest second;

        public Pair(Guest first, Guest second) {
            this.first = first;
            this.second = second;
        }

        public Guest getFirst() {
            return first;
        }

        public Guest getSecond() {
            return second;
        }

        public Pair flip() {
            return new Pair(second, first);
        }

        @Override
        public int compareTo(Pair o) {
            if (Integer.compare((first.getValue() + second.getValue()), (o.getFirst().getValue() + o.getSecond().getValue())) == 0) {
                if (Integer.compare(first.getValue(), o.getFirst().getValue()) != 0) {
                    return Integer.compare(first.getValue(), o.getFirst().getValue());
                } else {
                    return Integer.compare(second.getValue(), o.getSecond().getValue());
                }
            } else

                return Integer.compare((first.getValue() + second.getValue()), (o.getFirst().getValue() + o.getSecond().getValue()));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    private static class Guest implements Comparable<Guest> {
        private final int index;
        private final int value;

        public Guest(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Guest guest = (Guest) o;
            return index == guest.index &&
                    value == guest.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, value);
        }

        @Override
        public String toString() {
            return "Guest{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Guest o) {
            return Integer.compare(value, o.getValue());
        }
    }
}
