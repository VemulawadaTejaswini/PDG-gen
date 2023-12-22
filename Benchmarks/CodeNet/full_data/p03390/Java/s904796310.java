import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solveB();
    }

    private void solveB() {

        try (Scanner sc = new Scanner(System.in);) {
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                long x = sc.nextLong();
                long y = sc.nextLong();

                long sum = x * y;

                int sqrt = (int) Math.sqrt(sum);
                int result = sqrt * 2;
                if (sqrt * (sqrt + 1) > sum) {
                    result--;
                }
                if (sqrt >= x) result--;
                if (sqrt >= y) result--;

                System.out.println(result);
            }

        }

        // System.out.println(Math.pow(sqrt, 2));
    }

    private void solveA() {

        List<Integer> list = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in);) {
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int min = list.get(0);
        int middle = list.get(1);
        int max = list.get(2);
        int count = 0;

        while (min != middle || middle != max) {
            for (int i = 0; i < 2; i++) {
                min++;
                if (min > middle) {
                    int tmp = middle;
                    middle = min;
                    min = tmp;
                }
                if (min > max) {
                    int tmp = max;
                    max = min;
                    min = tmp;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}
