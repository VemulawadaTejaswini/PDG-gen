import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X == 2){System.out.println("2"); return;}
        Map<Boolean, List<Integer>> res = IntStream.rangeClosed(2, X+10000).boxed().collect(new PrimeCollector());
        int prm = res.get(true).stream().filter(a->a>=X).findFirst().get();
        System.out.println(prm);

    }

    private static class PrimeCollector implements Collector<Integer, Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>>{

        @Override
        public Supplier<Map<Boolean, List<Integer>>> supplier() {
            Map<Boolean, List<Integer>> res = new HashMap<>();
            res.put(true, new ArrayList<>());
            res.put(false, new ArrayList<>());
            return ()->res;
        }

        @Override
        public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
            return (mp, candidate)->{

                boolean isDivisible = mp.get(true).stream().filter(d -> d<=Math.sqrt(candidate))
                        .anyMatch(d->candidate % d == 0);
                mp.get(!isDivisible).add(candidate);
            };
        }

        @Override
        public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
            return (mp1, mp2)->{
                mp1.get(false).addAll(mp2.get(false));
                mp1.get(true).addAll(mp2.get(true));
                return mp1;
            };
        }

        @Override
        public Function<Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> finisher() {
            return Function.identity();
        }

        @Override
        public Set<Characteristics> characteristics() {
            Set<Characteristics> cs = new HashSet<>();
            cs.add(Characteristics.IDENTITY_FINISH);
            return cs;
        }
    }
}
