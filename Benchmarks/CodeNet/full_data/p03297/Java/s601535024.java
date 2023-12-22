import java.util.Scanner;

class Query {
    public final long a, b, c, d;
    public Query(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

public class Main {

    public static void main(String[] args) {
        int t;
        Query[] qs;
        try (final Scanner cin = new Scanner(System.in)) {
            t = cin.nextInt();
            qs = new Query[t];
            for (int i = 0; i < t; i++) {
                qs[i] = new Query(
                        cin.nextLong(),
                        cin.nextLong(),
                        cin.nextLong(),
                        cin.nextLong()
                        );
            }
        }
        for (int i = 0; i < t; i++) {
            Query q = qs[i];
            if (q.d < q.b || q.a < q.b) {
                System.out.println("No");
            } else {
                long x = q.a % q.b;
                boolean f = false;
                do {
                    if (q.c < x && x < q.b) {
                        System.out.println("No");
                        f = true;
                        break;
                    } else {
                        x += q.d%q.b;
                    }
                } while (x < q.b && q.d % q.b != 0);
                if (!f) System.out.println("Yes");
            }
        }
    }
}
