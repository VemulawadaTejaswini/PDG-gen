import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char n[] = S.toCharArray();
        
        int maxCnt = 0;
        int cnt = 1;
        int bfr = -1;
        for(int i = 0; i < 4; i++ ) {
            int x = n[i] - 48;
            if( bfr == x ) {
                cnt++;
                maxCnt = Math.max( maxCnt, cnt );
            } else {
                cnt = 1;
                bfr = x;
            }
        }

        System.out.println( ( maxCnt >= 3 ) ? "Yes" : "No" );
    }
}
