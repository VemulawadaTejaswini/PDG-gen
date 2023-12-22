import java.util.Scanner;

public class Main{
    public static void main( String[] args ) throws Exception {
        Scanner in = new Scanner( System.in );
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();
        if ( a > 0 ){
            a--;
        }
        System.out.println( b / x - a / x );
    }
}