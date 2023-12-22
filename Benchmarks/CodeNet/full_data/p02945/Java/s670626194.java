import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        long p = A+B;
        long m = A - B;
        long k = A*B;
        long result = Math.max(p, m);
        result = Math.max(result, k);

        System.out.println(result);
        return;

    }
}
