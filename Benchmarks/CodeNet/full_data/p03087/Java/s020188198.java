import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] pos = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                pos[i] = 1;
            }
//            System.out.println("pos:" + pos[i]);
        }

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int l = 0; l < n; l++) {
            map.put(l, new HashMap<>());
            Map<Integer, Integer> tmpMap = map.get(l);
            tmpMap.put(l, 0);
            for (int r = l + 1; r < n; r++) {
                if (pos[r - 1] == 0) {
                    tmpMap.put(r, tmpMap.get(r - 1));
                } else {
                    tmpMap.put(r, tmpMap.get(r - 1) + 1);
                }
            }
        }
//        System.out.println(map);
//        System.out.println();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = map.get(l - 1).get(r - 1);
            System.out.println(ans);
        }

        sc.close();
    }

}
