import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        long maxNum = m / n + (m % n);
        long[] arr = divisorsFind(maxNum);
        for (int i = 0; i < arr.length; i++) {
            if (m % arr[i] == 0) {
                System.out.println(arr[i]);
                return;
            }
        }
    }

    private static long[] divisorsFind(long value) {
        List<Long> list = new ArrayList<>();
        list.add(value);
        for (long i = value / 2; i >= 1; i--) {
            if (value % i == 0) list.add(i);
        }
        long[] arr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
