import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = 0;

        long a = x / 11;
        ans = a * 2;
        
        if(x % 11 <= 6 && x % 11 != 0) {
            ans++;
        }else if (x % 11 != 0){
            ans += 2;
        }

        System.out.println(ans);

    }

}
