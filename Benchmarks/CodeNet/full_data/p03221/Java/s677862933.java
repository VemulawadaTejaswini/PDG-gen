import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        int[] p = new int[m];// 県番号
        int[] y = new int[m];// 年
        // int[][] py = new int[m][3];//0:元の順, 1:県, 2:年
        for(int i = 0; i < m; i++) {
            // py[i][0] = i;
            // py[i][1] = Integer.parseInt(sc.next());
            // py[i][2] = Integer.parseInt(sc.next());
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        
        // 年でソートして各県に割り振っていくのが一番無駄はない
        int[] ps = IntStream.of(p).distinct().toArray();
        Map<Integer, List<Integer>> pyMap = new HashMap<>();
        for(int pp: ps) {
            pyMap.put(pp, new ArrayList<>());
        }
        
        // int[] sortedp = Arrays.copyOf(p, p.length);
        // Arrays.sort(sortedp);
        for(int i = 0; i < m; i++) {
            List<Integer> ys = pyMap.get(p[i]);
            ys.add(y[i]);
        }
        
        pyMap.values().forEach(l -> l.sort(null));

        for(int i = 0; i < m; i++) {
            int index = pyMap.get(p[i]).indexOf(y[i]);
            System.out.printf("%06d%06d%n", p[i], index + 1);
        }
        
    }
}
