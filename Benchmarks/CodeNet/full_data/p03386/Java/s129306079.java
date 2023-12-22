import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextInt();

        Set<Long> set = new HashSet<>();
        long enda;
        if (b >= a + k) {
            enda = a + k;
        } else {
            enda = b;
        }
        long startb;
        if (a >= b - k) {
            startb = a;
        } else {
            startb = b - k + 1;
        }

        for (long i = a; i < enda; i++) {
            set.add(i);
        }
        for (long i = startb; i <= b; i++) {
            set.add(i);
        }
        for (long i : set) {
            System.out.println(i);
        }
    }

}
