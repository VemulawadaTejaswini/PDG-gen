import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        HashSet<Long> set = new HashSet<>();
        for (long i = a; i < a + k && i <= b; i++) {
            set.add(i);
        }
        long tmp = 0;
        if(b < k) {
            tmp = b;
        } else {
            tmp = b - k + 1;
        }
        for (long i = b; i > b - k && i >= a ; i--) {
            set.add(i);
        }
        for (Long long1 : set) {
            System.out.println(long1);
        }
    }
}