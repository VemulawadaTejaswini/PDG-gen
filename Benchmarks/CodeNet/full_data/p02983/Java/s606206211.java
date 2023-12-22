import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long l = Long.parseLong(s.split(" ")[0]);
        long r = Long.parseLong(s.split(" ")[1]);

        long ans = 10000;
        for(long i = l; i <= Math.min(r, l + 2018); i++){
            for(long j = i + 1; j <= Math.min(r, l + 2018); j++){
                ans = Math.min(ans, i * j % 2019);
            }
        }

        System.out.println(ans);
        return;
    }
}
