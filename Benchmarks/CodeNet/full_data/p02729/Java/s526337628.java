import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 処理
        //n
        int np = 0;
        if ( n >= 2){
            np = n * (n - 1) / 2;
        }
        //m
        int mp = 0;
        if ( m >= 2){
            mp = m * (m - 1) / 2;
        }

        int out = np + mp;

        // 出力
        System.out.println(out);
    }
}