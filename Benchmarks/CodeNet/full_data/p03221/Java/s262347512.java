import java.util.*;
import java.util.stream.*;
import java.util.function.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        int[] p = new int[m];// 県番号
        int[] y = new int[m];
        for(int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // 県ごとの市の数
        Map<Integer, Long> pn = IntStream.of(p).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        
        for(int i = 0; i < m; i++) {
            int nth = 1;
            int size = pn.get(p[i]).intValue();
            for(int j = 0; j < m; j++) {
                // 同じ県かつ設立が前
                if(p[j] == p[i] && y[j] < y[i]) {
                    nth++;
                    if(nth == size) {
                        break;
                    }
                }
            }
            System.out.printf("%06d%06d%n", p[i], nth);
        }
    }
}
