import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC128_b solver = new ABC128_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC128_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            List shops = new ArrayList<Shop>();

            for (int i = 0; i < N; i++) {
                shops.add(new Shop(i + 1, in.next(), in.nextInt()));
            }
            Collections.sort(shops);
            for (Object shop : shops) {
                out.println(shop);
            }


        }

        class Shop implements Comparable<Shop> {
            private int no;
            private String name;
            private int score;

            public Shop(int no, String name, int score) {
                this.no = no;
                this.name = name;
                this.score = score;
            }

            public int getScore() {
                return score;
            }

            public String getName() {
                return name;
            }

            public String toString() {
                return String.valueOf(no);
            }

            public int compareTo(Shop o) {
                if (this.getName().equals(o.getName())) {
                    return (o.getScore() - this.getScore());
                } else {
                    return (this.getName().compareTo(o.getName()));
                }
            }

        }

    }
}

