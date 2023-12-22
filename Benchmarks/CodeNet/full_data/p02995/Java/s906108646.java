import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long p = d, q = c;
        while (p % q != 0) {
            long m = q;
            q = p % q;
            p = m;
        }
        long l = (c * d) / q;
        long counter_b = b - (b / c) - (b / d) + (b / l);
        long counter_a = (a - 1) - ((a - 1) / c) - ((a - 1) / d) + ((a - 1) / l);
        System.out.println(counter_b - counter_a);
        sc.close();
    }
}