import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (x % y == 0 || y % x == 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 1; i < Math.pow(10, 18) / x; i++) {
            if ((x * i) % y != 0) {
                System.out.println(x * i);
                return;
            }
        }
    }

}
