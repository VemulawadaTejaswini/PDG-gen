import java.util.Arrays;
import java.util.Scanner;

/**
 * B - 0 or 1 Swap
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 最大値
        int n = sc.nextInt();
        int[] p = new int[n];
        int replaceCnt = 0;
        String result = "YES";

        for( int i = 0; i < n; i++ ) {
            p[i] = sc.nextInt();
        }

        String beforeStr = Arrays.toString( p );
//        System.out.println( "beforeStr : " + beforeStr);
        Arrays.sort( p );
        String sortStr = Arrays.toString( p );
//        System.out.println( "sortStr : " + sortStr);
        for( int i = 0; i < beforeStr.length(); i++ ) {
//            System.out.println( "beforeStr - " + beforeStr.charAt( i ) + ": sortStr - " + sortStr.charAt( i ) + ": replaceCnt - " + replaceCnt);
            if( beforeStr.charAt( i ) != sortStr.charAt( i ) ) {
//                System.out.println( "replaceCnt++" );
                replaceCnt++;
//                System.out.println( "beforeStr - " + beforeStr.charAt( i ) + ": sortStr - " + sortStr.charAt( i ) + ": replaceCnt - " + replaceCnt);
                if( replaceCnt > 3 ) {
                    result = "NO";
                    break;
                }
            }
        }

        System.out.println( result );

        sc.close();
    }
}