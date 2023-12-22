import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            while (true) {
                if (prime(x)) {
                    System.out.println(x);
                    break;
                }
                ++x;
            }
        }
    }

    private static boolean prime(int x) {
        for (int i = 2; i < x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}