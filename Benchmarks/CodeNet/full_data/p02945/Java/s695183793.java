
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int r1 = a+b;
        int r2 =  a-b;
        int r3 = a*b;
        if(r3 >= r1){
            System.out.println(r3);
        }else if(r3 >= r2){
            System.out.println(r3);
        }else if(r2 >= r1){
            System.out.println(r2);
        }else{
            System.out.println(r1);
        }
    }
}