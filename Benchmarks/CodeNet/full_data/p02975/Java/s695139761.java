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
        if (map.size() == 1 || 3 < map.size()) {
            System.out.println("No");
            return;
        }
        if (map.size() == 3) {
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
            return;
        }
        if (map.size() == 2) {
            if (!has_zero(map)) {
                System.out.println("No");
                return;
            }
            if (N % 3 != 0) {
                System.out.println("No");
                return;
            }
            if (!count_check_size_2(map, N)) {
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
            return;
        }
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
    private boolean count_check_size_2(HashMap<Long, Integer> map, int N) {
        int zero_count = N / 3;
        int nonzero_count = N * 2 / 3;
        boolean result = true;
        for (long x : map.keySet()) {
            if (x == 0 && zero_count != map.get(x)) {
                result = false;
                break;
            }
            if (x != 0 && nonzero_count != map.get(x)) {
                result = false;
            }
        }
        return result;
    }
    private boolean has_zero(HashMap<Long, Integer> map) {
        for (long x : map.keySet()) {
            if (x == 0) {
                return true;
            }
        }
        return false;
    }
}
