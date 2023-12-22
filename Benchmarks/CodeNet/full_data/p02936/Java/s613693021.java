import java.util.*;

public class Main {
    HashMap<Integer, ArrayList<Integer>> childMap = new HashMap<>();
    TreeMap<Integer, Integer> countMap = new TreeMap<>();

    private void plus(int p, int x) {
        for (int t : childMap.get(p)) {
            if (!countMap.containsKey(t)) {
                countMap.put(t, 0);
            }
            countMap.put(t, countMap.get(t) + x);
            if (!childMap.get(t).isEmpty()) {
                plus(t, x);
            }
        }
    }

    private void execute2() {
        Scanner sc = new Scanner(System.in);

        String[] nq = sc.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);

        for (int i = 1; i < n; i++) {
            String[] ab = sc.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            if (!childMap.containsKey(a)) {
                childMap.put(a, new ArrayList<>());
            }
            if (!childMap.containsKey(b)) {
                childMap.put(b, new ArrayList<>());
            }
            childMap.get(a).add(b);
        }

        for (int i = 1; i <= q; i++) {
            String[] px = sc.nextLine().split(" ");
            int p = Integer.parseInt(px[0]);
            int x = Integer.parseInt(px[1]);

            if (!countMap.containsKey(p)) {
                countMap.put(p, 0);
            }
            countMap.put(p, countMap.get(p) + x);

            plus(p, x);
        }
        String result = "";
        for (int i : countMap.values()) {
            result += i + " ";
        }
        System.out.println(result.trim());
    }

    public static void main(String[] args) {
        new Main().execute2();
    }
}
