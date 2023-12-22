import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long tmp = n % k;
        if (tmp == 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.min(Math.abs(tmp - k), Math.abs(Math.abs(tmp - k) - k)));
        }
    }
}
