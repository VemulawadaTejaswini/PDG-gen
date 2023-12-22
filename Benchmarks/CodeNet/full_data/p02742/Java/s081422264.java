import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long w = sc.nextLong();

        BigDecimal ans = new BigDecimal(0);
        BigDecimal odd = new BigDecimal(h/2);
        BigDecimal even = new BigDecimal(h/2);
        if (h % 2L == 1L) {
            odd.add(BigDecimal.ONE);
        }

        ans = ans.add(odd.multiply(new BigDecimal(w/2)));
        ans = ans.add(even.multiply(new BigDecimal(w/2)));
        if (w % 2L == 1L) {
            ans = ans.add(odd);
        }
        System.out.println(ans);
    }
}
