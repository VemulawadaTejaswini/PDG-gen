// Runtime Error にならないかだけ見るため
import java.util.*;

class F {
    static char[] statement;
    static int c;
    static int d;

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            statement = sc.next().toCharArray();
            c = 0;
            System.out.println(value() + " " + (d + 1));
//            System.out.println(new String(statement, 0, d) + "[" + statement[d] + "]");
        }
    }

    static int value() {
        switch (statement[c]) {
            case '^':
                return max();
            case '_':
                return min();
            case '0':
                d = c;
                c++;
                return 0;
            default:
                final int i = statement[c] - '0';
                if (statement[c + 1] == '?') {
                    d = c + 1;
                    return i;
                } else if (!Character.isDigit(statement[c + 1])) {
                    d = c + 1;
                    c += 1;
                    return i;
                } else {
                    d = c + 1;
                    final int j = statement[c + 1] - '0';
                    c += 2;
                    return i * 10 + j;
                }
        }
    }

    static int min() {
        c += 2;
        final int left = value();
        if (left == 0) {
            final int dd = d;
            c++;
            value();
            c++;
            d = dd;
            return left;
        }
        c++;
        if (Character.isDigit(statement[c]) && statement[c] - '0' >= left) {
            final int dd = c;
            value();
            c++;
            d = dd;
            return left;
        } else {
            final int right = value();
            c++;
            return Math.min(left, right);
        }
    }

    static int max() {
        c += 2;
        final int left = value();
        if (left == 99) {
            final int dd = d;
            c++;
            value();
            c++;
            d = dd;
            return left;
        }
        c++;
        if (Character.isDigit(statement[c]) && (statement[c] - '0') * 10 + 9 <= left) {
            final int dd = c;
            value();
            c++;
            d = dd;
            return left;
        } else {
            final int right = value();
            c++;
            return Math.max(left, right);
        }
    }
}
public class Main {
    public static void main(String... args) {
        F.main();
    }
}