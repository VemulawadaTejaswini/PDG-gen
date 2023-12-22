import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] Ai = new int[N];
        List<Integer> Ai2 = new ArrayList<>();
        int[] Bi = new int[N];
        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        //AiとBiの値を配列に格納、AiとBiの値の対応付けをする
        for (int i = 0; i < N; i++) {

            Ai[i] = Integer.parseInt(sc.next());
            Bi[i] = Integer.parseInt(sc.next());

            //Aiの配列を重複のないListに格納
            if(!(Ai2.contains(Ai[i]))) {

                Ai2.add(Ai[i]);
            }

            //キーが重複したらまとめる
            if(map.containsKey(Ai[i])) {

                map.put(Ai[i], map.get(Ai[i]) + Bi[i]);
            } else {

                map.put(Ai[i], Bi[i]);
            }
        }

        sc.close();

        //Ai2を昇順にソート
        Collections.sort(Ai2);

        System.out.println(func(M, Ai2, map, BigDecimal.ZERO, BigDecimal.ZERO, 0));

    }

    //桁あふれ対策でBigDecimalを使って計算する
    public static BigDecimal func(int M, List<Integer> Ai2, Map<Integer, Integer> map, BigDecimal sum, BigDecimal pay, int i) {

        //栄養ドリンクが安い店から順に欲しい本数になるまで在庫分購入する
        switch (sum.compareTo(BigDecimal.valueOf(M))) {

        case -1:
            sum = sum.add(BigDecimal.valueOf(map.get(Ai2.get(i))));
            pay = pay.add(BigDecimal.valueOf(map.get(Ai2.get(i))).multiply(BigDecimal.valueOf(Ai2.get(i))));
            i++;
            return func(M, Ai2, map, sum, pay, i);

        case 0:

            return pay;

        //買いすぎた本数分払い戻しして支払い総額を求める
        default :
            pay = pay.subtract(((sum.subtract(BigDecimal.valueOf(M))).multiply(BigDecimal.valueOf(Ai2.get(i-1)))));
            return pay;
        }

    }
}