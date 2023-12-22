import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Set<Integer> use = new HashSet<>();
        Set<Integer> primes = new HashSet<>();
        primes.add(2);
        int num = 1;
        loop: while (use.size() < n) {
            num += 2;
            for (Integer prime : primes) {
                if (num % prime == 0) {
                    continue loop;
                }
            }
            primes.add(num);
            if (num % 5 == 1) {
                use.add(num);
            }
        }

        use.forEach(System.out::println);
    }
}