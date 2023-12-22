import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int M = scan.nextInt();
        ArrayList<Pair> data = new ArrayList();
        for (int i = 0; i < N; i++) {
            data.add(new Pair(1, scan.nextLong()));
        }
        for (int i = 0; i < M; i++) {
            int B = scan.nextInt();
            long C = scan.nextLong();
            data.add(new Pair(B, C));
        }
        data.sort(new PairComparator());
        long answer = 0;
        int remain = N;
        int index = 0;
        while (0 < remain) {
            Pair pair = data.get(index++);
            int size = pair.size;
            long value = pair.value;
            answer += Math.min(remain, size) * value;
            remain -= Math.min(remain, size);
        }
        System.out.println(answer);
    }
    class Pair {
        int size;
        long value;
        Pair(int size, long value) {
            this.size = size;
            this.value = value;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.value != o2.value) {
                return -Long.compare(o1.value, o2.value);
            }
            return -Integer.compare(o1.size, o2.size);
        }
    }
}
