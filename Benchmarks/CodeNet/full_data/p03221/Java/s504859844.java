import java.util.*;
import java.util.stream.*;
import java.util.function.*;

// 市 i が 県 Pi に属する市の中で x 番目に誕生した市のとき、市 i の認識番号の上 6 桁は Pi、下 6 桁は x となります。
// ただし、Pi や x が 6 桁に満たない場合は 6 桁になるまで 0 を左に追加するものとします。


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        int[] p = new int[m];// 県番号
        int[] y = new int[m];
        // long[] r = new long[m];
        // List<City> cities = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            // cities.add(new City(sc.nextInt(), 0, sc.nextInt()));
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            int nth = 1;
            for(int j = 0; j < m; j++) {
                // 同じ県かつ設立が前
                if(p[j] == p[i] && y[j] < y[i]) {
                    nth++;
                }
            }
            System.out.printf("%06d%06d%n", p[i], nth);
        }
        
        // Map<Integer, List<City>> citiesMap =
        //     cities.stream()
        //         .collect(Collectors.groupingBy(c -> c.p));
        
        
    }
}
