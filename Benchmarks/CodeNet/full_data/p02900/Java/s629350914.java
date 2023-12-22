import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = calc(a, b);
        System.out.println(Math.sqrt(max));
        int d = 0;
        for (int i = 2 ; i <= Math.sqrt(max) ; i++) {
            if (max % i == 0) {
                d++;
                while (max % i == 0) {
                    max /= i;
                }
            }
        }

        if (max > 1) d++;
        System.out.println(d + 1);
    }
    private static long calc(long a, long b) {
        if(a % b == 0) return b;
        if(a > b) return calc(b, a % b);
        return calc(a, b % a);
    }
}
