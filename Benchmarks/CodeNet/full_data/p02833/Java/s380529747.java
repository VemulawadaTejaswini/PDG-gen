import java.util.Scanner;

// E - Double Factorial
// https://atcoder.jp/contests/abc148/tasks/abc148_e
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Long.parseLong(scanner.next());
        scanner.close();

        long result = f(N);
        char[] chars = String.valueOf(result).toCharArray();

        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    private static long f(long n) {
        if (n == 0) return 0;

        long result = 1;
        while (n >= 2) {
            result *= n;
            n -= 2;
        }
        return result;
    }
}
