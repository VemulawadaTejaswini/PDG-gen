import java.util.Scanner;

/**
 * A - Round One
 * 高橋君はペーパークイズを解いています。高橋君はすらすらと解いていき、残すは最終問題のみとなりました。
 * この問題は、答えが 1,2,3 のいずれかである 3 択問題です。
 * 高橋君は超能力によって、A と B が誤答であることがわかりました。
 * この問題の答えを出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( 6 - a - b );

        sc.close();
    }
}