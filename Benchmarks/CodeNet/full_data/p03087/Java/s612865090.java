
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer Q = Integer.parseInt(scanner.next());
        String S = scanner.next();

        for (int i = 0; i < Q; i++) {
            Integer l = Integer.parseInt(scanner.next()), r = Integer.parseInt(scanner.next());
            if(S.length() < l) continue;
            if(S.length() < r)  r = S.length();
            Long count = 0L;
            for (int j = l-1; j < r-1; j++) {
                if(S.charAt(j) == 'A' && S.charAt(j+1) == 'C') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
