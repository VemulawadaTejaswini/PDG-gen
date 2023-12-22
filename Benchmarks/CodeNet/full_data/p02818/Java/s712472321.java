import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long k = stdIn.nextLong();

        if (a >= k) {
            a -= k;
            k = 0;
        } else if (a > 0) {
            a = 0;
            k -= a;
        }

        if (b >= k) {
            b -= k;
            k = 0;
        } else if (b > 0) {
            b = 0;
            k -= b;
        }

        System.out.println(a + " " + b);
    }
}
