import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Pair[] data = new Pair[N];
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            int p = scan.nextInt();
            data[i] = new Pair(i+1, s, p);
        }
        Arrays.sort(data, new PairComparator());
        for (int i = 1; i <= N; i++) {
            Pair p = data[i-1];
            System.out.println(p.id);
        }
    }
    class Pair {
        String S;
        int P;
        int id;
        Pair(int id, String S, int P) {
            this.id = id;
            this.S = S;
            this.P = P;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (!o1.S.equals(o2.S)) {
                return o1.S.compareTo(o2.S);
            }
            return -Integer.compare(o1.P, o2.P);
        }
    }
}
