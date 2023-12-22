import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long ans = b - a + 1;
        long tmp = c;
        while (tmp <= b) {
            if (tmp > b)
                break;
            if (tmp >= a)
                ans--;
            tmp += c;
        }

        tmp = d;
        while (tmp <= b) {
            if (tmp > b)
                break;
            if (tmp % c == 0) {
                tmp += d;
                continue;
            }
            if (tmp >= a)
                ans--;
            tmp += d;
        }

        System.out.println(ans);
    }

    static long counter(long n, long a, long b) {
        long count = 0;
        long tmp = n;
        while (tmp <= b) {
            if (tmp > b)
                break;
            if (tmp >= a)
                count++;
            tmp += n;
        }
        return count;
    }
}