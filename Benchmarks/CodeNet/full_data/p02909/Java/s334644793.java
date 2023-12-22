import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        // 文字列の入力
        String today = sc.next();

        String tomorrow;
        if( today.equals( "Sunny" ) ) {
            System.out.println( "Tomorrow:Cloudy" );
        }
        else if( today.equals( "Cloudy" ) ) {
            System.out.println( "Tomorrow:Rainy" );
        }
        else {
            System.out.println( "Tomorrow:Sunny" );
        }
    }
}