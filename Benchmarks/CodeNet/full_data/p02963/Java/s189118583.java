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
        long sqrt = (long)Math.sqrt((double)longParam);
        if( sqrt * sqrt == longParam ){
            System.out.println( "0 0 " + sqrt + " 0 0 " + sqrt );
            return;
        }

        System.out.println( "0 0 " + longParam + " 0 0 " + 1 );

    }

}