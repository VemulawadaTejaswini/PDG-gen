import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] pairs = new Pair[m];

        for (int i = 0; i < m; i++) {
           pairs[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(pairs, new SortByB());

        int res = 0;
        int lastBridge = 0;
        for (int i = 0; i < m; i++) {
            Pair curr = pairs[i];
            if (curr.a <= lastBridge) {
                continue;
            } else {
                lastBridge = curr.b - 1;
                res++;
            }
        }
        System.out.println(res);
    }

    public static class Pair {
        int a;
        int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class SortByB implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return a.b - b.b;
        }
    }
}
