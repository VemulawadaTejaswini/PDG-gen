
import java.util.*;

public class Main {

    /* チェックリスト
     * SNSに結果を書き込むときはACかWAかのみ(半分だけACとかは書かないこと)
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        //String[] in = s.nextLine().split(" ");
        int r = 0;
        for(int i = 1;i<=n;i++){
            String str = String.valueOf(i);
            if(str.length() % 2 != 0){
                r++;
            }
        }
        System.out.println(r);
    }
}