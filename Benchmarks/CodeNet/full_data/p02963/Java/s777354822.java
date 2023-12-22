import java.util.Scanner;

public class Main {

    private static long lessThanSqrt (long a) {
        return (long)Math.sqrt(a-1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Long s = Long.parseLong( in.nextLine() );

        if( s == 1 ){
            System.out.println( "0 0 0 1 1 1");
            return;
        }
        Long lts = lessThanSqrt(s)+1;
        if( lts * lts == s ){
            System.out.println( "0 0 " + s / 2 + " 0 " + s / 2 +" 0");
            return;
        }

        System.out.println( "0 0 " + s + " 0 0 1");

    }

}