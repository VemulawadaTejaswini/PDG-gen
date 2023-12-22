import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int a = Integer.parseInt( params[0] );
        int b = Integer.parseInt( params[1] );
        int c = Integer.parseInt( params[2] );

        if( a == b && b == c ){
            System.out.println( "No" );
            return;
        }

        if( a != b && b != c && c != a ){
            System.out.println( "No" );
            return;
        }

        System.out.println( "Yes" );

    }

}
