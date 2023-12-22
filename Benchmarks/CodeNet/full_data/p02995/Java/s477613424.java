import java.util.Scanner;

public class Main {

    private static long lcm(long a, long b) {
        long temp;
        long c = a * b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return c / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long lcm = lcm(c, d);
        long ans = b - a + 1
                - (b / c - (a - 1) / c)
                - (b / d - (a - 1) / d)
                + (b / lcm - (a - 1) / lcm);
        System.out.println(ans);
    }
    
}
