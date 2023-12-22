
import java.util.Scanner;

/**
 * 高橋君は、全
N
 ページから成る書類を両面印刷します。両面印刷では、
1
 枚の紙に
2
 ページ分のデータを印刷することが出来ます。

最小で何枚の紙が必要か求めてください。
 * @author nkyy0
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数値の入力
        int s = sc.nextInt();
        int answer=0;
        // 出力用
        if(s%2 > 0 ) {
            answer = s/2 + 1;
        }
        else {
            answer = s/2;
        }
        // 出力
        System.out.println(answer);
    }
}