import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.monstersBattleRoyale();
    }

    private void monstersBattleRoyale() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.next());
            int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(scan.next())).sorted().toArray();
            System.out.println(gcdAll(a, 0));
        }
    }

    private int gcdAll(int[] a, int n) {
        if (n == a.length - 2) {
            return gcd(a[n], a[n + 1]);
        }
        return gcd(a[n], gcdAll(a, n + 1));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        return gcd(b, a % b);
    }

    private void foodsLovedByEveryone() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.next());
            int m = Integer.parseInt(scan.next());
            List<List<Integer>> lovedFoods = IntStream.range(0, n).boxed().map(
                    i -> {
                        int j = Integer.parseInt(scan.next());
                        return IntStream.range(0, j).map(l -> Integer.parseInt(scan.next())).boxed().collect(Collectors.toList());
                    })
                    .collect(Collectors.toList());

            System.out.println(
                    IntStream.rangeClosed(1, m)
                            .mapToObj(i -> lovedFoods.stream().filter(j -> j.contains(i)).count()).filter(i -> i >= n).count());
        }
    }

    private void bPlusMinusA() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            if (b % a == 0) {
                System.out.println(a + b);
            } else {
                System.out.println(b - a);
            }
        }
    }
}
