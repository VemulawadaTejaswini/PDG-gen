import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = 0;
        long n = sc.nextLong();
        long m = sc.nextLong();
        total = n <= m / 2 ? n : m / 2;
        m -= 2 * n;
        total += m / 4;
        System.out.println(total);
    }

}
