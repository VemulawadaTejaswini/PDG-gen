import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char n[] = S.toCharArray();
        
        int sum = 0;
        for( int i = 0; i < S.length(); i++ ) {
            sum += n[i] - 48;
        }
        
        int num = Integer.parseInt(S);
        
        System.out.println( (num % sum == 0) ? "Yes" : "No" );
    }
}
