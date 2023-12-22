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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        List<Integer> dp = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (dp.size() == 0) {
                dp.add(A[i]);
                continue;
            }
            if (dp.get(0) < A[i]) {
                dp.set(0, A[i]);
                continue;
            }
            if (A[i] <= dp.get(dp.size()-1)) {
                dp.add(A[i]);
                continue;
            }
            int insert_point = ~Collections.binarySearch(dp, A[i], new LowerBoundComparator<Integer>());
            dp.set(insert_point, A[i]);
        }
        System.out.println(dp.size());
    }
    class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
        public int compare(T x, T y) {
            return (x.compareTo(y) >= 0) ? -1 : +1;
        }
    }
}
