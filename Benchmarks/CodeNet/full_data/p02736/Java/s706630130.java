import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean isDump = false;

    static class TriEnt {

        private static final int EMPTY = -1;

        int v1;
        int c1;
        int v2;
        int c2;

        TriEnt(int value) {
            v1 = value;
            c1 = 1;
            v2 = EMPTY;
            c2 = EMPTY;
        }

        static boolean isEmpty(int value) {
            return value == EMPTY;
        }

        int calc() {
            if (!hasValue2()) {
                return c1 == 1 ? v1 : 0;
            }
            int v = Math.abs(v1 - v2);
            int c10 = c1 - 1;
            int c20 = c2 - 1;
            if (c10 == 0 || c20 == 0) {
                return v;
            }
            int h = Integer.min(
                Integer.highestOneBit(c10),
                Integer.highestOneBit(c20)) << 1;
            do {
                int c10in = c10 % h;
                int c20in = c20 % h;
                if (c10in + c20in >= h) {
                    return 0;
                }
            } while ((h >>= 1) > 0);
            return v;
        }

        void shift() {
            v1 = v2;
            c1 = c2;
            v2 = EMPTY;
            c2 = EMPTY;
        }

        boolean hasValue2() {
            return c2 != EMPTY;
        }

        void setValue2(int value) {
            v2 = value;
            c2 = 1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[').append(v1).append(", ").append(c1).append("], ");
            if (hasValue2()) {
                sb.append('[').append(v2).append(", ").append(c2).append(']');
            } else {
                sb.append("[*, *]");
            }
            return sb.toString();
        }
    }

    static class Tri {

        final List<TriEnt> triEnts = new ArrayList<>();

        void addValue(int value, int level) {
            if (triEnts.size() == level) {
                if (!TriEnt.isEmpty(value)) {
                    triEnts.add(new TriEnt(value));
                }
                return;
            }
            TriEnt triEnt = triEnts.get(level);
            if (triEnt.hasValue2()) {
                if (!TriEnt.isEmpty(value) && triEnt.v2 == value) {
                    triEnt.c2++;
                } else {
                    int nextValue2 = triEnt.calc();
                    addValue(nextValue2, level + 1);
                    triEnt.shift();
                    if (!TriEnt.isEmpty(value)) {
                        triEnt.setValue2(value);
                    }
                }
            } else { // not have value2
                if (!TriEnt.isEmpty(value)) {
                    if (triEnt.v1 == value) {
                        triEnt.c1++;
                    } else {
                        triEnt.setValue2(value);
                    }
                }
            }
        }

        void dump() {
            if (!isDump) {
                return;
            }
            int index = 0;
            int w = Integer.toString(triEnts.size() - 1).length();
            String fmt = "%" + w + "d: %s%n";
            for (TriEnt triEnt : triEnts) {
                System.err.printf(fmt, index++, triEnt);
            }
            System.err.println();
        }

        int result() {
            return triEnts.get(triEnts.size() - 1).calc();
        }

    }

    private static int readN(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int c = is.read();
            if ('0' <= c && c <= '9') {
                sb.append((char) c);
            } else if (c == '\n') {
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }

    private static void readA(InputStream is, int n) throws IOException {
        Tri tri = new Tri();
        for (int i = 0; i < n; i++) {
            int value = is.read() - '0';
            tri.addValue(value, 0);
            tri.dump();
        }
        tri.addValue(-1, 0);
        tri.dump();
        System.out.println(tri.result());
    }

    public static void main(String... args) throws IOException {
        String filename = null;
        for (String arg : args) {
            switch (arg) {
            case "-d":
                isDump = true;
                break;
            default:
                filename = arg;
                break;
            }
        }
        InputStream is;
        if (filename == null) {
            is = System.in;
        } else {
            is = new FileInputStream(filename);
        }
        int n = readN(is);
        readA(is, n);
    }
}
