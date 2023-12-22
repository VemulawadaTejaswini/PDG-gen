
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        Pair hoge = fuga(N);

        System.out.println(hoge.sum());
    }
    private static Pair fuga(long number) {
        double sqrt = Math.sqrt(number);
        long floor = (long) Math.floor(sqrt);

        long current = floor;
        while (current > 0) {
            if (number % current == 0) {
                return new Pair(current, number / current);
            }
            current--;
        }
        return new Pair(1L, number);
    }

    private static class Pair {
        long a;
        long b;
        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public long sum() {
            return (a-1) + (b-1);
        }

        @Override
        public String toString() {
            return "(" + a + ", " + b + ")";
        }
    }

}