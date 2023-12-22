import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] p = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            int tmpP = Integer.parseInt(sc.next());
            int tmpY = Integer.parseInt(sc.next());
            p[i] = tmpP;
            y[i] = tmpY;
            if (map.containsKey(tmpP)) {
                map.get(tmpP).add(tmpY);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(tmpY);
                map.put(tmpP, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            Collections.sort(e.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(String.format("%06d", p[i]));
            sb.append(String.format("%06d", map.get(p[i]).indexOf(y[i]) + 1));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}