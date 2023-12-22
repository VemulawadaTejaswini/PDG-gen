
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        double a = Integer.parseInt(ss[0]); //X Z
        double b = Integer.parseInt(ss[1]); //Y
        double x = Integer.parseInt(ss[2]); //体積
        double menseki = x / a; //面積
        double sita = (menseki * 2) / b;
        double tanA = b / sita;
        System.out.println(Math.toDegrees(Math.atan(tanA)));
    }
}