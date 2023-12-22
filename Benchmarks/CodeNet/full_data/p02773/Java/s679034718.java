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
        abc155_c solver = new abc155_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc155_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            List polly = new ArrayList<Player>();

            for (int i = 0; i < N; i++) {
                String S = in.next();
                int count = 0;
                for (int j = 0; j < polly.size(); j++) {
                    Player item = (Player) polly.get(j);
                    if (S.compareTo(item.getName()) == 0) {
                        item.count = item.getCount() + 1;
                        polly.set(j, item);
                    }
                }
                if (count == 0) {
                    polly.add(new Player(0, S));
                }
            }
            Collections.sort(polly);
            Collections.reverse(polly);
            int tops = 0;
            for (int i = 0; i < polly.size(); i++) {
                Player item;
                item = (Player) polly.get(i);
                if (i == 0) {
                    tops = item.getCount();
                }
                if (tops == item.getCount()) {
                    out.println(item.getName());
                }
            }
        }

        class Player implements Comparable<Player> {
            private int count;
            private String name;

            public Player(int count, String name) {
                this.count = count;
                this.name = name;
            }

            public int compareTo(Player o) {
                if (this.getCount() == o.getCount()) {
                    return o.getName().compareTo(this.getName());
                } else {
                    return (this.getCount() - o.getCount());
                }
            }

            public int getCount() {
                return count;
            }

            public String getName() {
                return name;
            }

            public String toString() {
                return count + " " + name;
            }

        }

    }
}

