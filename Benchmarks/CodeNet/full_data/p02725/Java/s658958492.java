import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // 処理
        int out = k;

        //時計回り
        for(int i = 0; i < n; i++){
            int dist = a[(i - 1 + n) % n] - a[i];
            if (dist < 0) {
                dist += k;
            }
            out = dist < out ? dist : out;
        }

        //反時計回り
        for(int i = 0; i < n; i++){
            int dist = k - a[(i + 1 + n) % n] + a[i];
            if (dist < 0) {
                dist += k;
            }
            out = dist < out ? dist : out;
        }
        
        // 出力
        System.out.println(out);
    }
}