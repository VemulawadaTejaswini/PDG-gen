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
        int[] a = new int[N];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
            List<Integer> list = map.get(a[i]);
            list.add(i);
        }
        if (map.get(1).isEmpty()) {
            System.out.println(-1);
            return;
        }
        int current = -1;
        int count = 0;
        Comparator<Integer> comparator = new UpperBoundComparator<>();
        for (int i = 1; i <= N; i++) {
            List<Integer> list = map.get(i);
            if (list.isEmpty()) {
                break;
            }
            int x = ~Collections.binarySearch(list,  current, comparator);
            if (list.size() <= x) {
                break;
            }
            current = list.get(x);
            count += 1;
        }
        System.out.println(N-count);
    }
    class UpperBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
        public int compare(T x, T y) {
            return (x.compareTo(y) > 0) ? 1 : -1;
        }
    }
}
