import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < n; i++) {
            int j = binarySearch(list, a[i]);
            if (j == -1) {
                list.add(0, a[i]);
            } else {
                list.set(j, a[i]);
            }
        }
        System.out.println(list.size());
    }

    static int binarySearch(List<Integer> list, int i) {
        int ok = -1, ng = list.size();
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list.get(mid) < i) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
}