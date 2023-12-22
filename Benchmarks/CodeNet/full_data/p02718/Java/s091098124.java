import java.util.Scanner;

/**
 * B - Popular Vote
 * N 種類の商品に対して人気投票を行いました。
 * 商品 i は Ai 票を得ています。
 * この中から人気商品 M 個を選びます。
 * ただし、得票数が総投票数の 1/4M 未満であるような商品は選べません。
 * 人気商品 M 個を選べるなら Yes、選べないなら No を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 全商品数
        int n = sc.nextInt();
        // 人気商品の数
        int m = sc.nextInt();

        // 総得票数（最大が1000）
        int[] a = new int[n];
        int votesAllNum = 0;
        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
            votesAllNum += a[i];
        }

        // 総得票数の1/4M
        int votesNum = votesAllNum / ( 4 * m );
        int cnt = 0;
        String result = "No";
        for( int i = 0; i < n; i++ ) {
            if( a[i] >= votesNum ) {
                cnt++;
                if( cnt >= m ) {
                    result = "Yes";
                    break;
                }
            }
        }

        System.out.println( result );

        sc.close();
    }
}