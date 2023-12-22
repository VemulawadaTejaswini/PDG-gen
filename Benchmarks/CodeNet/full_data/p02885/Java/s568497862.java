
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] ints = sc.nextLine().split(" ");
        int a = Integer.parseInt(ints[0]);
        int b = Integer.parseInt(ints[1]);
        if(a - b * 2 < 0){
            System.out.println(0);
        }else{
            System.out.print(a - b * 2);
        }
    }
}