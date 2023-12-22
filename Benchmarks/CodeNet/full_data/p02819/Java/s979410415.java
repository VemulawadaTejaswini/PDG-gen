import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();
        long ret = x;
        while (true) {
            if (isPrime(ret)) {
                break;
            }
            ret++;
        }
        System.out.println(ret);
    }

    public static boolean isPrime(long x) {
        if (x == 1 || x == 2) {
            return true;
        }

        if (x % 2 == 0) {
            return false;
        }

        boolean ret = false;
        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                ret = false;
                break;
            }
            ret = true;
        }
        return ret;
    }

}