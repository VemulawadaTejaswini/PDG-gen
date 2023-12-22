import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        Set<Long> set = new HashSet<>();

        if (a + k - 1 >= b - k + 1) {
            for (long i = a; i <= b; i++) {
                System.out.println(i);
            }
            return;
        }

        for (long i = a; i < a + k; i++) {
            set.add(i);
        }
        for (long i = b - k + 1; i <= b; i++) {
            set.add(i);
        }
        for (long i : set) {
            System.out.println(i);
        }
    }

}
