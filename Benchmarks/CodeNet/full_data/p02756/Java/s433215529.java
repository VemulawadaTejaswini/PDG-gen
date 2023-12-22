import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = Integer.parseInt(sc.next());
        String[] query = new String[q];
        for (int i = 0; i < q; i++) {
            query[i] = sc.next();
            if ("2".equals(query[i])) {
                query[i] += sc.next() + sc.next();
            }
        }

        // 主処理
        int reverseFlg = -1;
        for (int i = 0; i < query.length; i++) {
            if (query[i].charAt(0) == '2') {
                if (query[i].charAt(1) == '1' || (query[i].charAt(1) == '2' && 0 < reverseFlg)) {
                    s = query[i].charAt(2) + s; // 先頭に追加
                } else {
                    s += query[i].charAt(2);
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