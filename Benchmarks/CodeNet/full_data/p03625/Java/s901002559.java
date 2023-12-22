import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Bar> barlist = new ArrayList<>();
        HashMap<Integer,Bar> bars = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long a = scan.nextLong();
            if (!bars.containsKey(a)) {
                Bar b = new Bar();
                b.x = a;
                b.count = 1;
                barlist.add(b);
                bars.put(a, b);
            } else {
                Bar b = bars.get(a);
                b.count += 1;
            }
        }
        barlist.sort(new BarComparetor());
        long first = 0;
        long second = 0;
        for (int i = 0; i < N && (first == 0 || second == 0); i++) {
            Bar b = barlist.get(i);
            if (b.count == 1) {
                continue;
            }
            if (first == 0) {
                if (4 <= b.count) {
                    first = b.x;
                    second = b.x;
                } else {
                    first = b.x;
                }
                continue;
            }
            if (second == 0) {
                second = b.x;
            }
        }
        System.out.println(first*second);
    }
    class Bar {
        long x;
        int count;
    }
    class BarComparetor implements Comparator<Bar> {
        @Override
        public int compare(Bar o1, Bar o2) {
            if (o1.x== o2.x) {
                return -Integer.compare(o1.count, o2.count);
            }
            return -Long.compare(o1.x, o2.x);
        }
    }
}
