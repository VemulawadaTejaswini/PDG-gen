import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        // 文字列の入力
        String today = sc.next();

        String tomorrow;
        if( today.equals( "Sunny" ) ) {
             tomorrow = "Cloudy";
        }
        else if( today.equals( "Cloudy" ) ) {
            tomorrow = "Rainy";
        }
        else {
            tomorrow = "Sunny";
        }

        // 出力
        System.out.println( "Tomorrow:" + tomorrow );
    }
}