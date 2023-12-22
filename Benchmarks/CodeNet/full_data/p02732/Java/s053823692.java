
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ballCount = sc.nextInt();
        int[] balls = new int[ballCount];
        int[] numCounts = new int[2 * 100000];
        for (int i = 0; i < ballCount; i++) {
            balls[i] = sc.nextInt();
            numCounts[balls[i]]++;
        }
        Map<Integer, Integer> numCountMap = IntStream.of(balls).filter(i -> numCounts[i] > 1).distinct().boxed()
                .collect(Collectors.toMap(Function.identity(), i -> Integer.valueOf(numCounts[i.intValue()])));
        Map<Integer, Integer> resultCache = numCountMap.entrySet().parallelStream()
                .collect(Collectors.toMap(Entry::getKey, e -> combCount(e.getValue())));

        IntStream.of(balls).map(i -> sumComb(i, numCountMap, resultCache))
                .mapToObj(Long::toString)
                .forEach(System.out::println);
    }

    private static int sumComb(int i, Map<Integer, Integer> numCountMap, Map<Integer, Integer> resultCache) {
        int otherTotal = resultCache.entrySet().stream().filter(e -> e.getKey().intValue() != i).map(Entry::getValue)
                .mapToInt(Integer::intValue).sum();
        if (numCountMap.containsKey(i)) {
            int iCount = numCountMap.get(i);
            int iComb = ((iCount - 1) * (iCount - 2)) / 2;
            return iComb + otherTotal;
        } else {
            return 0;
        }
    }

    private static Integer combCount(Integer value) {
        return (value * (value - 1)) / 2;
    }
}
