import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private class Span {
        int s, t, c;

        public Span(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        Span ban[] = new Span[n];
        for (int i = 0; i < n; i++) {
            ban[i] = new Span(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(ban, (o1, o2) -> o1.s - o2.s);

        List<Span> recs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean add = true;
            for (Span rec : recs) {
                if (rec.t > ban[i].s) {
                    break;
                }
                if ((rec.t == ban[i].s && rec.c == ban[i].c) || (rec.t < ban[i].s)) {
                    rec.s = ban[i].s;
                    rec.t = ban[i].t;
                    rec.c = ban[i].c;
                    add = false;
                }
            }

            if (add) {
                recs.add(new Span(ban[i].s, ban[i].t, ban[i].c));
            }

            recs.sort((o1, o2) -> o1.t - o2.t);
        }

        System.out.println(recs.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
