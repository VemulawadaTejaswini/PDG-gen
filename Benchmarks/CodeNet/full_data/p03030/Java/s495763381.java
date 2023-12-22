import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static long n;

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:24-

            int n = sc.nextInt();
            List<R> rs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                rs.add(new R(i, sc.next(), sc.nextInt()));
            }

            rs.stream()
                    .sorted()
                    .forEach(p -> out.println(p.id + 1));
        }
    }
    
    private static class R implements Comparable<R> {
        private final int id;
        private final String name;
        private final int score;

        public R(int id, String name, int score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(R o) {
            int r1 = this.name.compareTo(o.name);
            if (r1 != 0) {
                return r1;
            }
            return o.score - this.score;
        }
    }
}
