import java.util.Scanner;


public class Main {
    private static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        boolean exist = false;
        long x = b * 10;
        for (long i = x; i <= x + 9; i++) {
            long y = (i * 8) / 100;
            if (a == y) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");

        if (!sc.hasNext()) {
            return;
        }
    }
}
