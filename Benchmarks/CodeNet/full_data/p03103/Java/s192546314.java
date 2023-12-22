import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] Ai = new int[N];
        int[] Bi = new int[N];
        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        //AiとBiの値を配列に格納、AiとBiの値の対応付けをする
        for (int i = 0; i < N; i++) {

            Ai[i] = Integer.parseInt(sc.next());
            Bi[i] = Integer.parseInt(sc.next());
            map.put(Ai[i], Bi[i]);
        }

        sc.close();

        //Aiを昇順にソート
        Arrays.sort(Ai);

        System.out.println(func(M, Ai, map, BigDecimal.ZERO, BigDecimal.ZERO, 0));

    }

    //桁あふれ対策でBigDecimalを使って計算する
    public static BigDecimal func(int M, int[] Ai, Map<Integer, Integer> map, BigDecimal sum, BigDecimal pay, int i) {

        //栄養ドリンクが安い店から順に欲しい本数になるまで在庫分購入する
        if (sum.compareTo(BigDecimal.valueOf(M)) == -1) {

            sum = sum.add(BigDecimal.valueOf(map.get(Ai[i])));
            pay = pay.add(BigDecimal.valueOf(map.get(Ai[i])).multiply(BigDecimal.valueOf(Ai[i])));
            i++;
            return func(M, Ai, map, sum, pay, i);

        //買いすぎた本数分払い戻しして支払い総額を求める
        } else {

            pay = pay.subtract(((sum.subtract(BigDecimal.valueOf(M))).multiply(BigDecimal.valueOf(Ai[i-1]))));
            return pay;
        }
    }
}