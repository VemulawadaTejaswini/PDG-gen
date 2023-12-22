
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        long prev = 0;
        long r = 0;
        for(long i = 0;i < n;i++){
            long now = Long.parseLong(sc.next());
            if(prev < now){
                r = 0;
            }else{
                r++;
            }
            prev = now;
        }
        System.out.println(r);
    }
}