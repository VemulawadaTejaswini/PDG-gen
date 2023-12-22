
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        long max = 1000000000L;
        Scanner scanner = new Scanner(System.in);
        System.out.println("? " + max);
        String ans = scanner.next();
        if (ans.equals("Y")) {
            System.out.println("! " + max);
            return;
        }
        int length = 1;
        long i;

        for (i = 999999999L; i > 0; i/= 10) {
            System.out.println("? " + i);
            ans = scanner.next();
            if (ans.equals("N")) {
                length = getLength(i) + 1;
                break;
            }
        }
        int[] num = new int[length + 1];
        for (int k = 0; k < length + 1; ++k) {
            num[k] = 9;
        }
        for (int pos = 0; pos < length; ++pos) {
            findValueOnCurrentPos(num, pos, scanner);
        }
        System.out.print("! ");

        for (int pos = 0; pos < length; ++pos) {
            System.out.print(num[pos]);
        }
        System.out.println();

    }

    public static void findValueOnCurrentPos(int[] num, int pos, Scanner scanner) {
        String ans;
        int l = -1; // value > l
        int r = 10; // value <= r
        while (r - l > 1) {
            int mid = (l + r) / 2;
            num[pos] = mid;
            System.out.print("? ");
            for (int i = 0; i < num.length; ++i) {
                System.out.print(num[i]);
            }
            System.out.println();
            ans = scanner.next();
            if (ans.equals("Y")) {
                r = mid;
            } else {
                l = mid;
            }
        }

        num[pos] = r;
    }

    public static int getLength(long i) {
        int length = 0;
        while (i > 0) {
            ++length;
            i /= 10;
        }
        return length;
    }
}
