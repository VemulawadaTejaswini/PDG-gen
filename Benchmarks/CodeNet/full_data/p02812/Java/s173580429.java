import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String s = in.nextLine();

        int count = 0;
        for( int i = 0 ; i < n - 2 ; i++ ){
            char c = s.charAt(i);
            if( c == 'A' && s.charAt( i + 1 ) == 'B' && s.charAt( i + 2 ) == 'C' ){
                count++;
            }
        }

        System.out.println( count );

    }

}
