import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static class TriEnt {

        int v1;
        int c1;
        int v2;
        int c2;

        TriEnt(int value) {
            v1 = -1;
            c1 = -1;
            v2 = value;
            c2 = 1;
        }

        int calc() {
            if (c2 == -1) {
                return c1 == 1 ? v1 : 0;
            }
            int v = Math.abs(v1 - v2);
            int c10 = c1 - 1;
            int c20 = c2 - 1;
            if (c10 == 0 || c20 == 0) {
                return v;
            }
            int h = Integer.max(
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
            v2 = -1;
            c2 = -1;
        }

        boolean hasValue1() {
            return c1 > 0;
        }

        boolean hasValue2() {
            return c2 > 0;
        }

        void setValue2(int value) {
            v2 = value;
            c2 = 1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (hasValue1()) {
                sb.append('[').append(v1).append(", ").append(c1).append(']');
            } else {
                sb.append("[*, *]");
            }
            sb.append(", ");
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
                if (value >= 0) {
                    triEnts.add(new TriEnt(value));
                }
                return;
            }
            TriEnt triEnt = triEnts.get(level);
            if (triEnt.v2 == value) {
                triEnt.c2++;
            } else {
                if (triEnt.hasValue1()) {
                    int value2 = triEnt.calc();
                    addValue(value2, level + 1);
                }
                triEnt.shift();
                if (value >= 0) {
                    triEnt.setValue2(value);
                } else {
                    addValue(-1, level + 1);
                }
            }
        }

        void dump() {
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
            //tri.dump();
        }
        tri.addValue(-1, 0);
        //tri.dump();
        System.out.println(tri.result());
    }

    public static void main(String[] args) throws IOException {
        InputStream is;
        if (args.length == 0) {
            is = System.in;
        } else {
            is = new FileInputStream(args[0]);
        }
        int n = readN(is);
        readA(is, n);
    }
}
