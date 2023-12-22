import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        String base = "abcdefghijklmnopqrstuvwxyz";

        for( int i = 0 ; i < base.length() ; i++ ){
            if( c.charAt(0) == base.charAt( i ) ){
                System.out.println( base.charAt( i + 1) );
                return;
            }
        }

    }

}
