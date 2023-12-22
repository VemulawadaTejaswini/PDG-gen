import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String a[] = str.split(" ", 0);
        int h = Integer.parseInt(a[0]);
        int w = Integer.parseInt(a[1]);
        BigInteger res = BigInteger.ONE;
        res = res.multiply(BigInteger.valueOf(h));
        res = res.multiply(BigInteger.valueOf(w));
        res = res.divide(BigInteger.valueOf(2));
        
        if(h % 2 == 1 && w % 2 == 1) {
            res = res.add(BigInteger.valueOf(1));
            
        } else {
            
        }
        
        System.out.println(res);
        
    }
}
