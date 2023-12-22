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
        long[] a = new long[N];
        boolean foundNonZero = false;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            if (!map.containsKey(a[i])) {
                map.put(a[i], 0);
            }
            int count = map.get(a[i]);
            map.put(a[i], count+1);
            if (0 < a[i]) {
                foundNonZero = true;
            }
        }
        if (!foundNonZero) {
            System.out.println("Yes");
            return;
        }
        if (map.size() != 3) {
            System.out.println("No");
            return;
        }
        if (N % 3 != 0) {
            System.out.println("No");
            return;
        }
        if (!count_check(map, N)) {
            System.out.println("No");
            return;
        }
        if (check_xor(map)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    private boolean check_xor(HashMap<Long, Integer> map) {
        List<Long> list = new ArrayList<>();
        for (long x : map.keySet()) {
            list.add(x);
        }
        list.sort(Comparator.naturalOrder());
        return (list.get(0) ^ list.get(1)) == list.get(2);
    }
    private boolean count_check(HashMap<Long, Integer> map, int N) {
        int count = N / 3;
        for (long x : map.keySet()) {
            if (count != map.get(x)) {
                return false;
            }
        }
        return true;
    }
}
