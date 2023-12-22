import java.util.Scanner;

/**
 * B - Greedy Takahashi
 * 高橋君は A 枚、青木君は B 枚のクッキーを持っています。
 * 高橋君は以下の行動を K 回繰り返します。
 * ・もし高橋君がクッキーを 1 枚以上持っているなら、高橋君のクッキーを 1 枚食べる。
 * ・そうでなく、もし青木君がクッキーを 1 枚以上持っているなら、青木君のクッキーを 1 枚食べる。
 * ・高橋君も青木君もクッキーを持っていないなら、何もしない。
 * 高橋君と青木君が最終的に持っているクッキーの枚数をそれぞれ求めてください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        long a = sc.nextLong(); // 高橋君が持っているクッキーの枚数
        long b = sc.nextLong(); // 青木君が持っているクッキーの枚数
        long k = sc.nextLong(); // 高橋君が繰り返す数

        long resultA = 0;
        long resultB = 0;
        if( a <= k ) {
            resultA = a - k;
            k = k - a;
        }

        if( k > 0 ) {
            resultB = b - k;
        }

        System.out.println( ( resultA <= 0 ? 0 : resultA ) + " " + ( resultB <= 0 ? 0 : resultB ) );

        sc.close();
    }
}