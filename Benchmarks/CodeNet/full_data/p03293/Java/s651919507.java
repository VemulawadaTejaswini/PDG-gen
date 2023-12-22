import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        String[] strS = new String[S.length()];
        String[] strT = new String[T.length()];

        for ( int i = 0; i < S.length(); i++ ) {
            strS[i] = String.valueOf( S.charAt(i) );
            strT[i] = String.valueOf( T.charAt(i) );
        }

        Arrays.sort( strS );
        Arrays.sort( strT );

        for (int i = 0; i < strS.length; i++) {
            if( !strS[i].equals( strT[i]) ){
                System.out.print( "No" );
                return;
            }
        }
        System.out.print( "Yes" );

        sc.close();
    }
}