import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (true) {
            if (x > 2 && x % 2 == 0) {
                x++;
            }
            boolean isOK = true;
            for (int i = 3; i < Math.sqrt(x) ; i++) {
                if (gcd(i, x) > 1) {
                    x++;
                    isOK = false;
                    break;
                }
            }
            if (isOK) {
                break;
            }
        }

        System.out.println(x);
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}