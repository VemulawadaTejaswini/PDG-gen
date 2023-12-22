import java.util.*;

class F {
    static char[] statement;
    static int c;

    static class Ans {
        int value;
        int pos;

        Ans(int value, int pos) {
            this.value = value;
            this.pos = pos;
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
            System.out.println(expression(0, 99));
            if(statement[c] != '?')
                throw null;
        }
    }

    static Ans expression(int lo, int up) {
        switch (statement[c]) {
            case '^':
                return max(lo, up);
            case '_':
                return min(lo, up);
            default:
                return value(lo, up);
        }
    }

    static Ans value(int lo, int up) {
        final int i = statement[c] - '0';
        final int pos = i == 0 || i * 10 + 9 <= lo || i >= up ? c + 1 : c + 2;
        if (Character.isDigit(statement[c + 1])) {
            final int r = i * 10 + statement[c + 1] - '0';
            c += 2;
            return new Ans(r, pos);
        } else {
            c++;
            return new Ans(i, pos);
        }
    }

    static Ans min(int lo, int up) {
        c += 2;
        final Ans left = expression(lo, up);
        c++;
        final Ans right = expression(lo, Math.min(up, left.value));
        c++;
        return new Ans(Math.min(left.value, right.value), left.value <= lo ? left.pos : right.pos);
    }

    static Ans max(int lo, int up) {
        c += 2;
        final Ans left = expression(lo, up);
        c++;
        final Ans right = expression(Math.max(lo, left.value), up);
        c++;
        return new Ans(Math.max(left.value, right.value), left.value >= up ? left.pos : right.pos);
    }
}

public class Main {
    public static void main(String... args) {
        F.main();
    }
}