
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
//        long ans = x * (x - 1);

        BigInteger ans = new BigInteger(x+"");
        BigInteger tmp = ans.subtract(new BigInteger("1"));
        ans = ans.multiply(tmp);
        ans = ans.divide(new BigInteger("2"));
        System.out.println(ans);


    }

}
