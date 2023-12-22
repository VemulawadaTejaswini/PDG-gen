import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] p = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            if (map.containsKey(p[i])) {
                map.get(p[i]).add(y[i]);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(y[i]);
                map.put(p[i], l);
            }
        }

        for (int i = 0; i < m; i++) {
            Collections.sort(map.get(p[i]));
            int idx = map.get(p[i]).indexOf(y[i]) + 1;
            System.out.printf("%06d%06d\n", p[i], idx);
        }

    }

}
