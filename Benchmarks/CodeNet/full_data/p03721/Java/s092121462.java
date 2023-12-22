import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Pair p = new Pair(a, b);
            pairs.add(p);
        }

        Collections.sort(pairs, (p1, p2) -> p1.a > p2.a ? 1 : -1);
        long sum = 0;
        for (Pair p : pairs) {
            sum += p.b;
            if (k <= sum) {
                System.out.print(p.a);
                return;
            }
        }
    }

    static class Pair{
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
