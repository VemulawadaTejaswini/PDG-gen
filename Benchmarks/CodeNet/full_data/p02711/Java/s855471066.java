import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String n = sc.next();

        // 処理
        String out = "No";
        if(n.charAt(0) == '7' || n.charAt(1) == '7' || n.charAt(2) == '7'){
            out = "Yes";
        }

        // 出力
        System.out.println(out);
    }

}