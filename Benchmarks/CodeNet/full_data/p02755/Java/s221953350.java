import java.util.Scanner;

/**
 * C - Tax Increase
 * 消費税率が 8 %のとき A 円、10 ％のとき B 円の消費税が課されるような商品の税抜き価格を求めてください。
 * ただし、税抜き価格は正の整数でなければならないものとし、消費税の計算において小数点以下は切り捨てて計算するものとします。
 * 条件を満たす税抜き価格が複数存在する場合は最も小さい金額を出力してください。
 * また、条件を満たす税抜き価格が存在しない場合は -1 と出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 8%の時の消費税額
        int a = sc.nextInt();
        // 10%の時の消費税額
        int b = sc.nextInt();

        double tax8  = a / 0.08;
        double tax10 = b / 0.1;
//        System.out.println("tax8 : " + tax8 + " - tax10 : " + tax10);
//        System.out.println(tax8 * 0.1);
//        System.out.println(Math.floor( tax8 * 0.1 ));
        if( b != Math.floor( tax8 * 0.1 ) ) {
            System.out.println( -1 );
        }
        else {
            System.out.println( ( int ) tax8 );
        }

        sc.close();
    }
}