import java.util.Scanner;
 
public class Main{
    public static void main( String[] args ) throws Exception {
        Scanner in = new Scanner( System.in );
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        if ( a > 0 ){
            a--;
        }
        System.out.println( b / x - a / x );
    }
}