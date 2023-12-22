import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Vec2l> jobs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                jobs.add(new Vec2l(in.nextLong(), in.nextLong()));
            }
            jobs.sort(Comparator.comparing(v -> v.y));
            long time = 0;
            for (int i = 0; i < n; i++) {
                time += jobs.get(i).x;
                if (time > jobs.get(i).y) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

    }

    static class Vec2l {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Vec2l{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2l vec2l = (Vec2l) o;
            return x == vec2l.x &&
                    y == vec2l.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}

