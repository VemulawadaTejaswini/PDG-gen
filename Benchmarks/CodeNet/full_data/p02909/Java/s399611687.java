
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String current = sc.nextLine();
        if(current.equalsIgnoreCase("sunny")){
            System.out.println("Cloudy");
        }else if(current.equalsIgnoreCase("cloudy")){
            System.out.println("Rainy");
        }else if(current.equalsIgnoreCase("rainy")){
            System.out.println("Sunny");
        }
    }
}