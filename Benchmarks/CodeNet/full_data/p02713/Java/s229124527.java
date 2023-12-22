
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var k = sc.nextInt();

        var sum = 0l;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    sum += gcdTriple(a, b, c);
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            var tmp = b;
            b = a;
            a = tmp;
        }

        var mod = a % b;
        if (mod == 0) {
            return b;
        } else {
            return gcd(b, mod);
        }
    }

    private static int gcdTriple(int a, int b, int c) {
        int[] arr = new int[]{ a, b, c };
        Arrays.sort(arr);
        int gcd1 = gcd(arr[1], arr[2]);
        return gcd(arr[0], gcd1);
    }
}
