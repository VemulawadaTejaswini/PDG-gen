
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Dish> list = new ArrayList<Dish>(N);
        for (int i = 0; i < N; i++) {
            list.add(new Dish(sc.nextInt(), sc.nextInt()));
        }
        PriorityQueue<Dish> takahashi = new PriorityQueue<Dish>((a, b) -> {
            if (a.diff == b.diff) {
                if (a.a == b.a) {
                    return -(a.b - b.b);
                } else {
                    return -(a.a - b.a);
                }
            } else {
                return (a.diff - b.diff);
            }
        });
        PriorityQueue<Dish> aoki = new PriorityQueue<Dish>((a, b) -> {
            if (a.diff == b.diff) {
                if (a.b == b.b) {
                    return -(b.a - a.a);
                } else {
                    return -(a.b - b.b);
                }
            } else {
                return (a.diff - b.diff);
            }
        });
        takahashi.addAll(list);
        aoki.addAll(list);
        BigDecimal takahashiSum = BigDecimal.ZERO;
        BigDecimal aokiSum = BigDecimal.ZERO;
        // long takahashiSum = 0;
        // long aokiSum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Dish dish;
                while ((dish = takahashi.poll()).used)
                    ;
                int val = dish.getA();
                takahashiSum = takahashiSum.add(new BigDecimal(val));
                System.err.println(dish);
            } else {
                Dish dish;
                while ((dish = aoki.poll()).used)
                    ;
                int val = dish.getB();
                aokiSum = aokiSum.add(new BigDecimal(val));
                System.err.println(dish);
            }
        }
        System.out.println(takahashiSum.subtract(aokiSum));
    }
}

class Dish {
    int a;
    int b;
    int diff;
    boolean used = false;

    Dish(int a, int b) {
        this.a = a;
        this.b = b;
        diff = a - b;
    }

    /**
     * @return the a
     */
    public int getA() {
        used = true;
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        used = true;
        return b;
    }

    @Override
    public String toString() {
        return a + ", " + b + "  d: " + diff;
    }
}