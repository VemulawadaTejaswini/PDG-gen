import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] idxes = new int[n + 1];
        TreeSet<Integer> allIdx = new TreeSet<>();
        allIdx.add(-1);
        allIdx.add(n);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            idxes[x] = i;
            allIdx.add(i);
        }
        long total = 0;
        for (int i = n; i > 0; i--) {
            long left = allIdx.lower(idxes[i]);
            long right = allIdx.higher(idxes[i]);
            total += i * (idxes[i] - left) * (right - idxes[i]);
            allIdx.remove(idxes[i]);
        }
        System.out.println(total);
    }
}
