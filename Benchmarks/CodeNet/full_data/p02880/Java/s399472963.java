import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

//    public static int[] primes(int n) {
//        List<Integer> candidates =
//                IntStream.rangeClosed(2, n).boxed().collect(Collectors.toList());
//
//        int prime = 2;
//        double upper = Math.sqrt(n);
//        while (prime < upper) {
//            int currentPrime = prime;
//            candidates = candidates.stream().filter(c -> c % currentPrime != 0).
//                    collect(Collectors.toList());
//            prime = candidates.stream().filter(c -> c > currentPrime).findFirst().get();
//        }
//
//        return candidates.stream().mapToInt(Integer::valueOf).toArray();
//    }

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        int N = sc.nextInt();

//        if (Arrays.stream(primes(N)).filter(n -> n >= 1 && n <= 9).count() >= 2) System.out.println("Yes");
//        else System.out.println("No");
        
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (N == a * b) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

}
