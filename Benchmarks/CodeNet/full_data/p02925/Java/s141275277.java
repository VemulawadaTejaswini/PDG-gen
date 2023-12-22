import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static class Pair {
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        Deque<Pair> deque = new ArrayDeque<>();

        List<Deque<Pair>> xs = IntStream
                .range(0, count)
                .mapToObj(it -> {
                    Stream<Pair> stream = IntStream
                        .range(0, count - 1)
                        .mapToObj(n -> new Pair(it, std.nextInt() - 1));
                  List<Pair> list = stream.collect(Collectors.toList());
                        return new ArrayDeque<Pair>(list);
                })
                .collect(Collectors.toList());

        Function<Integer, Boolean> check = index -> {
            Deque<Pair> targetMatches = xs.get(index);
            if (targetMatches.isEmpty()) {
                return false;
            }
            int opponentIndex = targetMatches.getFirst().right;
            Deque<Pair> opponent = xs.get(opponentIndex);
            if (opponent.isEmpty()) {
                return false;
            }

            Pair first = opponent.getFirst();
            if (first.right == index) {
                // same user
                Pair p = new Pair(first.left, first.right);
                if (p.right < p.left) {
                    int l = p.left;
                    p.left = p.right;
                    p.right = l;
                }
                if (deque.isEmpty()) {
                    deque.add(p);
                } else {
                    boolean contains = false;
                    for (Pair pair : deque) {
                        if (pair.left == p.left && pair.right == p.right) {
                            contains = true;
                            break;
                        }
                    }

                    if (!contains) {
                        deque.add(p);
                    }
                }
            }

            return true;
        };

        IntStream.range(0, count).forEach(check::apply);
        int days = 0;
        while (!deque.isEmpty()) {
            days++;
            Deque<Pair> prevDeque = new ArrayDeque<>(deque);

            deque.clear();
            for (Pair p : prevDeque) {
                xs.get(p.left).pollFirst();
                xs.get(p.right).pollFirst();
            }

            for (Pair p : prevDeque) {
                check.apply(p.left);
                check.apply(p.right);
            }
        }

        long rest = xs.stream().filter(it -> !it.isEmpty()).count();
        if (rest != 0) {
            System.out.println(-1);
        } else {
            System.out.println(days);
        }
    }
}
