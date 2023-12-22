import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[]b = new int[n];
        List<Pair> list = new ArrayList<>();
        for (int i = 0 ;i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Pair pair = new Pair();
            pair.from = a[i];
            pair.end = b[i];
            list.add(pair);
        }

        Collections.sort(list);

        long ans = 0;
        for (int i = 0 ; i < n ; i++) {
            int j = list.get(i).end;
            int coin = list.get(i).from;
            if (m > j) {
                ans += (long) coin * j;
                m -= j;
            } else {
                ans += (long) coin * m;
                m = 0;
                break;
            }
        }

        System.out.println(ans);
    }

}

class Pair implements Comparable {
    int from;
    int end;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return from - otherpair.from;
    }
}