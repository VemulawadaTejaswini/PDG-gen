import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int N = scanner.nextInt();
        long lcm = 1;
        for (int i = 0; i < N; i++) {
            lcm = lcm(lcm, scanner.nextLong());
        }
        System.out.println(lcm);
    }

    long lcm(long a, long b) {
        long gcd = a > b ? gcd(a, b) : gcd(b, a);
        return a / gcd * b;
    }

    long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
