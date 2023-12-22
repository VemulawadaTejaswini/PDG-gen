import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        Map<Integer, List<Integer>> d = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(sc.next());
            for (int j = 0; j < k; j++) {
                int s = Integer.parseInt(sc.next()) - 1;
                List<Integer> l = d.getOrDefault(s, new ArrayList<>());
                l.add(i);
                d.put(s, l);
            }
        }

        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        int res = 0;

        for (int i = 0; i < (1 << n); i++) {
            int[] ii = new int[m];
            for (int j = 0; j < n; j++) {
                if((1 & i >> j) == 1) {
                    List<Integer> l = d.getOrDefault(j, new ArrayList<>());
                    for (int iii : l) {
                        ii[iii] += 1;
                    }
                }
            }

            boolean b = true;
            for (int j = 0; j < m; j++) {
                if(ii[j] % 2 != p[j]) {
                    b = false;
                    break;
                }
            }
            if(b) {
                res++;
            }
        }

        System.out.println(res);
    }
}
