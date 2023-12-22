import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long n = sc.nextLong();
        long k = sc.nextLong();

        // 処理
        long out = n;

        if ( k == 1){
            out = 0;
        } else {
            out = n % k;
        }

        // while(out >= k){
        //     out = n > k ? n - k : k - n;
        // }

        // 出力
        System.out.println(out);
    }
}