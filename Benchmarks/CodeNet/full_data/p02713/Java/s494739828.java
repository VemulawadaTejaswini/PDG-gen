import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int k = sc.nextInt();

        // 処理
        long out = 0;
        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    long gcd1 = gcd(a, b);
                    long gcd2 = gcd(gcd1, c);
                    out += gcd2;
                }
            }
        }

        // 出力
        System.out.println(out);
    }
    public static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}