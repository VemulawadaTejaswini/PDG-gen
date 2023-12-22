import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();
        TreeMap<Integer, Integer> result = new TreeMap<>();

        IntStream.range(0,1000)
                .boxed()
                .reduce(0, (accumulator, val)->{
                    int ac = accumulator+val;
                    result.put(val,ac);
                    return ac;
                });

        OptionalInt answer = result.entrySet().parallelStream()
                .filter(ent -> ent.getValue()-a==result.get(ent.getKey()+1)-b)
                .mapToInt(ent -> ent.getValue()-a)
                .findFirst();

        /*
        int accumulator = 0;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            int nextAccumulator = accumulator + i;
            if (accumulator - a == nextAccumulator - b){
                ans = accumulator -a;
                break;
            }
            accumulator = nextAccumulator;
        }
        */
        System.out.println(answer.orElse(0));
        scanner.close();
    }
}
