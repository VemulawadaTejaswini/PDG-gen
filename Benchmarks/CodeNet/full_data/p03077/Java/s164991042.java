import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();

        long aBottoleNeck = (long)Math.ceil((double)n/(double)a);
        long bBottoleNeck = (long)Math.ceil((double)n/(double)b);
        long cBottoleNeck = (long)Math.ceil((double)n/(double)c);
        long dBottoleNeck = (long)Math.ceil((double)n/(double)d);
        long eBottoleNeck = (long)Math.ceil((double)n/(double)e);

        long maxBottoleNeck = Math.max(aBottoleNeck, Math.max(bBottoleNeck, Math.max(cBottoleNeck, Math.max(dBottoleNeck, eBottoleNeck))));
        System.out.println(maxBottoleNeck + 4);
    }
}