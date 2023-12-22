import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int K = scanner.nextInt();
        final int[] t = new int[N];
        final int[] d = new int[N];
        for (int k = 1; k <= N; k++) {
            t[k - 1] = scanner.nextInt();
            d[k - 1] = scanner.nextInt();
        }
        final int typeVariety = (int) Arrays.stream(t)
                .distinct()
                .count();

        final NavigableMap<Integer, List<Sushi>> sushis = new TreeMap<>(Comparator.reverseOrder());
        for (int k = 1; k <= N; k++) {
            final int index = k - 1;
            sushis.compute(d[index], (key, existingValue) -> {
                if (existingValue == null) {
                    return new ArrayList<>(Collections.singletonList(new Sushi(t[index], d[index])));
                } else {
                    existingValue.add(new Sushi(t[index], d[index]));
                    return existingValue;
                }
            });
        }
        final int minTypeCount = (int) sushis.values().stream()
                .flatMap(List::stream)
                .limit(K)
                .mapToInt(Sushi::getType)
                .distinct()
                .count();

        List<Sushi> deliciousMaximizedChoice = sushis.values().stream()
                .flatMap(List::stream)
                .limit(K)
                .collect(Collectors.toList());
        final Map<Integer, Sushi> uniqueChosen = deliciousMaximizedChoice.stream()
                .collect( //
                        Collectors.toMap( //
                                Sushi::getType, //
                                Function.identity(), //
                                (sushiA, sushiB) -> sushiA.getDelicious() > sushiB.getDelicious() ? sushiA : sushiB) // choice more delicious
                );
        final PriorityQueue<Sushi> nonUniqueChosen = new PriorityQueue<>(Comparator.comparingInt(Sushi::getDelicious).reversed());
        nonUniqueChosen.addAll(deliciousMaximizedChoice.stream()
                .filter(sushi -> !uniqueChosen.values().contains(sushi))
                .collect(Collectors.toList()));

        long ansCandidate = deliciousMaximizedChoice.stream()
                .mapToInt(Sushi::getDelicious)
                .asLongStream()
                .sum() + minTypeCount * minTypeCount;

        for (long typeCount = minTypeCount + 1; typeCount <= typeVariety; typeCount++) {
            final Set<Integer> chosenType = Stream.concat(uniqueChosen.values().stream(), nonUniqueChosen.stream())
                    .map(Sushi::getType)
                    .collect(Collectors.toSet());
            final Sushi additionalChoice = sushis.values().stream()
                    .flatMap(List::stream)
                    .filter(s -> !chosenType.contains(s.getType()))
                    .findFirst() // must be exist
                    .orElseThrow(InternalError::new); // never thrown
            uniqueChosen.put(additionalChoice.getType(), additionalChoice);
            nonUniqueChosen.poll();
            long maxBasePoint = Stream.concat(uniqueChosen.values().stream(), nonUniqueChosen.stream())
                    .mapToInt(Sushi::getDelicious)
                    .asLongStream()
                    .sum();

            final long totalPoint = maxBasePoint + typeCount * typeCount;
            if (totalPoint > ansCandidate) {
                ansCandidate = totalPoint;
            }

        }

        System.out.println(ansCandidate);
    }

    static class Sushi {
        private final int type;
        private final int delicious;

        Sushi(int type, int delicious) {
            this.type = type;
            this.delicious = delicious;
        }

        public int getType() {
            return type;
        }

        public int getDelicious() {
            return delicious;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.type, this.delicious);
        }

        @Override
        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (object == this) {
                return true;
            }
            if (!(object instanceof Sushi)) {
                return false;
            }
            final Sushi other = (Sushi) object;
            return this.type == other.type && this.delicious == other.delicious;
        }
        @Override
        public String toString() {
            return "Sushi (type = " + type + ", delicious = " + delicious + ")";
        }
    }

}
