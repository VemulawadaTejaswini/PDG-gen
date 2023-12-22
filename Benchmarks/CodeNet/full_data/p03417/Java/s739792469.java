import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n < 2 || m < 2) {
            if (n == 1 && m == 1) {
                System.out.println(1);
            } else {
                long l = Math.max(n, m);
                System.out.println(l - 2);
            }
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
