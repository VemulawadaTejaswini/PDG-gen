import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] is = new int[m][2];
        for (int i = 0; i < m; i++) {
            is[i][0] = sc.nextInt();
            is[i][1] = sc.nextInt();
        }
        //        System.out.println(is.length);

        LinkedHashMap<Integer, Set<Integer>> map = new LinkedHashMap<>();
        for (int[] i : is) {
            int a = i[0];
            int b = i[1];
            if (!map.containsKey(a)) {
                map.put(a, new TreeSet<>());
            }
            if (!map.containsKey(b)) {
                map.put(b, new TreeSet<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }
        // System.out.println(map);

        // 一番端点が少ないものから始める
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(a).size() - map.get(b).size());

        for (Integer start : list) {
            List<Integer> must = new ArrayList<>(map.get(start));
            if (must.size() == 1) {
                System.out.println(2);
                System.out.printf("%d %d%n", start, must.get(0));
            }
            
        }
    }
}
