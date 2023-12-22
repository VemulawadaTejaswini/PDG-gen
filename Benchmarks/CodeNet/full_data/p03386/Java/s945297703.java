import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        List<Long> list = new ArrayList<>();

        if (a + k - 1 >= b - k + 1) {
            for (long i = a; i <= b; i++) {
                System.out.println(i);
            }
            return;
        }

        for (long i = a; i < a + k; i++) {
            list.add(i);
        }
        for (long i = b - k + 1; i <= b; i++) {
            list.add(i);
        }
        Collections.sort(list);
        for (long i : list) {
            System.out.println(i);
        }
    }

}
