import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if( str.length() == 1 ){
            long s = Long.parseLong( str );
            if( s == 1 ){
                System.out.println( "0 0 0 1 1 1");
                return;
            }
        }
        long longParam = Long.parseLong(str);
        if( longParam < 1000000000 ){
            System.out.println( "0 0 " + longParam + " 0 0 " + 1 );
            return;
        }

        System.out.println( "0 0 " + longParam + " 0 0 " + 1 );

    }

}