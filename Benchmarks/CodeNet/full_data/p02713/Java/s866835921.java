
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        scan.close();

        int sum = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    int gcd = gcd(a, gcd(b, c));
                    sum += gcd;
                }
            }
        }

        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            int memory = a;
            a = b;
            b = memory;
        }

        int q = a % b;
        while (q != 0) {
            a = b;
            b = q;
            q = a % b;
        }
        return b;
    }

}
