import java.util.List;
import java.util.Scanner;

public class Main {
    static long count = 0;

    static boolean has753(long n) {
        boolean has7 = false;
        boolean has5 = false;
        boolean has3 = false;
        while (n > 0) {
            int v = (int) (n % 10);
            switch (v) {
            case 7:
                has7 = true;
                break;
            case 5:
                has5 = true;
                break;
            case 3:
                has3 = true;
                break;
            }
            n = n / 10;
        }
        return has7 && has5 && has3;

    }

    static void put3(long t, long n) {
        t = t * 10 + 3;
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;

                putHelper(t, n);
            } else {
                putHelper(t, n);
            }
            return;
        }

    }

    static void put5(long t, long n) {
        t = t * 10 + 5;
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;

                putHelper(t, n);
            } else
                putHelper(t, n);
            return;
        }

    }

    static void put7(long t, long n) {
        t = t * 10 + 7;
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;

                putHelper(t, n);
            } else
                putHelper(t, n);
            return;
        }

    }

    static void putHelper(long t, long n) {
        put3(t, n);
        put5(t, n);
        put7(t, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        putHelper(0, n);
        System.out.println(count);
    }
}
