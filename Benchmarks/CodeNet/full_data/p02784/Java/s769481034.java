import java.util.Scanner;

/**
 * B - Common Raccoon vs Monster
 * アライグマはモンスターと戦っています。
 * モンスターの体力は H です。
 * アライグマはN 種類の必殺技を使うことができ、i 番目の必殺技を使うとモンスターの体力をAi 減らすことができます。
 * 必殺技を使う以外の方法でモンスターの体力を減らすことはできません。
 * モンスターの体力を0 以下にすればアライグマの勝ちです。
 * アライグマが同じ必殺技を 2 度以上使うことなくモンスターに勝つことができるなら Yes を、できないなら No を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // モンスターの体力
        int h = sc.nextInt();
        // アライグマが使うことができる必殺技の数
        int n = sc.nextInt();
        // アライグマが必殺技で減らせるモンスターの体力を合算
        int sum = 0;
        for( int i = 0; i < n; i++ ) {
            sum += sc.nextInt();
        }

        System.out.println( sum >= h ? "Yes" : "No" );

        sc.close();
    }
}