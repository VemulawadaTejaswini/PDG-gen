import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if( str.length() == 1 ){
            Long s = Long.parseLong( str );
            if( s == 1 ){
                System.out.println( "0 0 0 1 1 1");
                return;
            }
        }

        for( int i = 10000 ; 0 < i ; i-- ){
            Long param = Long.parseLong(str);
            if( param % i == 0 ){
                System.out.println( "0 0 0 " + i + " " + param / i + " 0");
                return;
            }
        }

        System.out.println( "0 0 " + str + " 0 0 1");

    }

}