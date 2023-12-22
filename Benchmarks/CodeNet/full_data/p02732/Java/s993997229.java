import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            int c = count.getOrDefault(a[i], 0);
            count.put(a[i], ++c);
        }
        long allpair = 0;
        for (int i : count.values()) {
            if (i > 0) {
                allpair += (long) i * ((long) i - 1) / 2;
            }
        }
        for (int i = 0; i < N; i++) {
            int num = a[i];
            long ans = allpair;
            if (count.get(num) > 1) {
                ans -= (count.get(num) - 1);
            }
            System.out.println(ans);
        }
    }
}