import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Set<Integer> primeNumberSet = IntStream.rangeClosed(2, Math.max(a, b)).filter(Main::isPrimeNumber).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> divisorSetA = getDivisorList(a, primeNumberSet);
        Map<Integer, Integer> divisorSetB = getDivisorList(b, primeNumberSet);
        divisorSetB.keySet().forEach(k -> divisorSetA.put(k, Math.max(divisorSetB.get(k), divisorSetA.getOrDefault(k, 0))));
        System.out.println(divisorSetA.keySet().stream().mapToInt(k -> (int) Math.pow(k, divisorSetA.get(k))).reduce(1, (m, n) -> m * n));
    }
    static Map<Integer, Integer> getDivisorList(int n, Set<Integer> primeNumberSet) {
        return primeNumberSet.stream().filter(f -> f <= n).filter(m -> n % m == 0).collect(Collectors.toMap(m -> m, m -> count(n,m)));
    }

    static boolean isPrimeNumber(int n) {
        return IntStream.range(2, n).allMatch(m -> n % m != 0);
    }
    static int count(int m, int n){
        int count = 0;
        while (m % n == 0) {
            m = m/n;
            count++;
        }
        return count;
    }
}
