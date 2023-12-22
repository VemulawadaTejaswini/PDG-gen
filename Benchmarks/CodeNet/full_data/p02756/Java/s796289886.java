import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = Integer.parseInt(sc.next());
        int[] query = new int[q];
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < q; i++) {
            query[i] = Integer.parseInt(sc.next());
            if (query[i] == 2) {
                String f = sc.next();
                String c = sc.next();
                pq.add(f + c);
            }
        }

        // 主処理
        int reverseFlg = -1;
        for (int i = 0; i < query.length; i++) {
            if (query[i] == 2) {
                String func = pq.poll();
                if (func.charAt(0) == '1' || (func.charAt(0) == '2' && 0 < reverseFlg)) {
                    s = func.charAt(1) + s;// 先頭に追加
                } else {
                    s += func.charAt(1);
                }
            } else {
                reverseFlg *= -1;
            }
        }
        if (0 < reverseFlg) {
            s = new StringBuffer(s).reverse().toString();
        }

        // 出力
        System.out.println(s);
        sc.close();
    }
}