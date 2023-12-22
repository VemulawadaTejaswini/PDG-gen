// Runtime Error にならないかだけ見るため
import java.util.*;

class F {
    static char[] statement;
    static int c;
    static class Ans {
        int value;
        int pos;

        Ans(int value, int pos) {
            this.value = value;
            this.pos = pos + 1;
        }

        @Override
        public String toString() {
            return value + " " + pos;
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            statement = sc.next().toCharArray();
            c = 0;

            System.out.println(value());
//            System.out.println(new String(statement, 0, d) + "[" + statement[d] + "]");
        }
    }

    static Ans value() {
        switch (statement[c]) {
            case '^':
                return max();
            case '_':
                return min();
            case '0': {
                final int d = c;
                c++;
                return new Ans(0, d);
            }
            default:
                final int i = statement[c] - '0';
                if (statement[c + 1] == '?') {
                    final int d = c + 1;
                    return new Ans(i, d);
                } else if (!Character.isDigit(statement[c + 1])) {
                    final int d = c + 1;
                    c += 1;
                    return new Ans(i, d);
                } else {
                    final int d = c + 1;
                    final int j = statement[c + 1] - '0';
                    c += 2;
                    return new Ans(i * 10 + j, d);
                }
        }
    }

    static Ans min() {
        c += 2;
        final Ans left = value();
        if (left.value == 0) {
//            final int dd = d;
            c++;
            value();
            c++;
//            d = dd;
            return left;
        }
        c++;
        if (Character.isDigit(statement[c]) && statement[c] - '0' >= left.value) {
//            final int dd = c;
            value();
            c++;
//            d = dd;
            return left;
        } else {
            final Ans right = value();
            c++;
            return new Ans(Math.min(left.value, right.value), right.pos);
        }
    }

    static Ans max() {
        c += 2;
        final Ans left = value();
        if (left.value == 99) {
//            final int dd = d;
            c++;
            value();
            c++;
//            d = dd;
            return left;
        }
        c++;
        if (Character.isDigit(statement[c]) && (statement[c] - '0') * 10 + 9 <= left.value) {
//            final int dd = c;
            value();
            c++;
//            d = dd;
            return left;
        } else {
            final Ans right = value();
            c++;
            return new Ans(Math.max(left.value, right.value), right.pos);
        }
    }
}
public class Main {
    public static void main(String... args) {
        F.main();
    }
}