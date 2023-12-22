import java.util.*;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {
                        int n = sc.nextInt();
                        int k = sc.nextInt();
                        Map<Integer, Boolean>  dMap = new HashMap<>();
                        // 繰り上げのために最小の桁を保存しておく
                        for (int i = 0; i<k; i++) {
                                int d = sc.nextInt();
                                // 嫌いな数字はTRUEにしてMapに入れる
                                dMap.put(d, true); 
                        }
                        int min = getMinFromInput(dMap);
                        int amount = 0;
                        // 10~1000でnを割って各桁の数を支払える最小を調べる
                        for (int fig = 1; n > 0; fig = fig * 10) {
                                // 桁上げ用 
                                int upfig = 1;
                                int div = n % 10;
                                // 0 より小さければ終わり
                                //if ((n / 10) == 0) { break; } 
                                // Mapに入っていれば、嫌いなので一つ大きい数で支払う
                                while (dMap.containsKey(div) && dMap.get(div)) {
                                        // 支払えない時は繰り上げる
                                        if (div >= 9) {
                                                // 繰り上げ
                                                div = 1; 
                                                amount = 1111 * min; 
                                                amount = amount % (fig*10);
                                                upfig *= 10;
                                        } else {
                                                div++; 
                                                amount = 1111 * min;
                                                amount = amount % (fig * upfig);
                                        }
                                } 
                                n = n / 10;
                                amount += div * fig * upfig;
                        }
                        System.out.println(amount);

                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("入力値が不正です");
                }
        }
        private static int getMinFromInput(Map<Integer, Boolean> inputNumMap) {
                int min = 0;
                do {
                        if (!inputNumMap.containsKey(min)) {
                                // 最小値が見つかったのでおわり
                                break;
                        }
                        min++;
                } while (true);
                return min;
        }
}