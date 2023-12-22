import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long count = B/C - A/C;
        if (A % C == 0) {
            count++;
        }
        count += B/D - A/D;
        long lcm = lcm(C, D);
        count -= (B / lcm) - (A / lcm);

        System.out.println(B - A + 1 - count);
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

