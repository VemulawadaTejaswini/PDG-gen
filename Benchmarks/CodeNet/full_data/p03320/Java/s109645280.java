import java.util.*;

public class Main {
    public void main(Scanner sc) {
        long k = sc.nextLong();
        long n = 1;
        while (k != 0) {
            if (n * s(n + 1) <= (n + 1) * s(n)) {
                System.out.println(n);
                k--;
            }
            n++;
        }
    }

    private int s(long n) {
        int res = 0;
        while (n != 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
