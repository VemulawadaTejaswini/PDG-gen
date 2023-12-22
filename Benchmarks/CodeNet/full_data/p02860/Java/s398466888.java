import java.util.Scanner;

/**
 * B - Echo
 * 入力された数字が九九として表現できる場合はYes,できない場合はNoを出力する
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 文字列の桁数
        int n = sc.nextInt();
        String str = sc.next();
        // 繰り返しなしの桁数
        int strLen = n / 2;

        // 繰り返しなしの文字列
        String string1 = str.substring( 0, strLen );
        // ２回目の文字列
        String string2 = str.substring( strLen );


        if( string1.equals( string2 ) ) {
            System.out.println( "Yes" );
        }
        else {
            System.out.println( "No" );
        }

        sc.close();
    }
}