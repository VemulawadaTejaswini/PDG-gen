import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(sc.next()));
            }

            System.out.println(calc(list));
        }
    }

    private static double calc(List<Integer> list) {
        BigDecimal child = BigDecimal.ONE;
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < list.size(); i++) {
            BigDecimal cache = BigDecimal.ONE;
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    cache = cache.multiply(BigDecimal.valueOf(list.get(j)));
                }
            }
            System.out.println("i = " + i + ";cache = " + cache);

            sum = sum.add(cache);
            child = child.multiply(BigDecimal.valueOf(list.get(i)));
        }
        System.out.println("sum = " + sum);

        return child.divide(sum).doubleValue();
    }

    @Test
    public void test() {
        assertEquals(0.5, calc(List.of(1, 1)));
        assertEquals(7.5, calc(List.of(10, 30)));
        // assertEquals(66.66666666666667, calc(List.of(200, 200, 200)));
        assertEquals(1000, calc(List.of(1000)));
        assertEquals(500, calc(List.of(1000, 1000)));
        assertEquals(250, calc(List.of(1000, 1000, 1000, 1000)));
    }
}
