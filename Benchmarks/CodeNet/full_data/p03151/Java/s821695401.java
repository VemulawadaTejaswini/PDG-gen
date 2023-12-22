import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long sumA = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sumA += a[i];
        }
        long sumB = 0;
        List<Integer> notPassIdxList = new ArrayList<>();
        List<Long> valCanMoveList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
            sumB += b[i];
            if (a[i] < b[i]) {
                notPassIdxList.add(i);
            } else {
                valCanMoveList.add(a[i] - b[i]);
            }
        }
        if (sumA < sumB) {
            System.out.println(-1);
            return;
        }
        Collections.sort(valCanMoveList, Collections.reverseOrder());
        int j = 0;
        long target = 0;
        for (int i = 0; i < notPassIdxList.size(); i++) {
            int k = notPassIdxList.get(i);
            while (target < b[k] - a[k]) {
                target += valCanMoveList.get(j++);
            }
            target -= b[k] - a[k];
        }
        System.out.println(n - (valCanMoveList.size() - j));
    }

}
