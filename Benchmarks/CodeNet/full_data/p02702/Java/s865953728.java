import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long cnt = 0;
        for (int i = 0; i < s.length() - 4; i++) {
            for (int j = i + 3; j <= s.length(); j++) {
                BigDecimal tmp = new BigDecimal(s.substring(i, j));
                BigDecimal div =new BigDecimal("2019");
                BigDecimal dived = tmp.remainder(div);
                BigDecimal equal = new BigDecimal("0");
                if (dived.equals(equal)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
