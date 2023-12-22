import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();

        double aaa = (n - d) * 2 * 2 + (n - d) * 4 * (m - 2);

        System.out.println(aaa / Math.pow(n, m));
    }
}
