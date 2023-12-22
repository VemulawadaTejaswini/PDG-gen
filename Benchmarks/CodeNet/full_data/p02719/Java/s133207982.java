import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long k =sc.nextLong();
        n = n % k;
        while (true) {
            long tmp = Math.abs(k - n);
            if (tmp >= n) {
                break;
            }
            n = tmp;
        }
        System.out.println(n);
    }
}
