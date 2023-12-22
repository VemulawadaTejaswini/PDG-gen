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

            // (time to do , time limit)
            ArrayList<Vec2i> job = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                job.add(new Vec2i(in.nextInt(), in.nextInt()));
            }

            job.sort(Comparator.comparing(v -> v.y));

            int time = 0;
            for (int i = 0; i < n; i++) {
                if (time + job.get(i).x <= job.get(i).y) {
                    time += job.get(i).x;
                } else {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");

        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Vec2i{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}

