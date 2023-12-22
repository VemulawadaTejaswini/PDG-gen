import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long k = stdIn.nextLong();

        for (int i = 0; i < k; i++) {
            if (a > 0) {
                a--;
            } else if (b > 0) {
                b--;
            }
        }

        System.out.println(a + " " + b);
    }
}
