import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> count = new TreeMap<>(Comparator.reverseOrder());
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count.put(a[i], count.getOrDefault(a[i], 0) + 1);
            max = Math.max(a[i], max);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(getNext(count));
            } else {
                System.out.println(max);
            }
        }
    }

    static int getNext(Map<Integer, Integer> count) {
        int loop = 1;
        for (Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() > 1) {
                return e.getKey();
            }

            if (loop > 1) {
                return e.getKey();
            }
            loop++;
        }
        return 0;
    }
}
