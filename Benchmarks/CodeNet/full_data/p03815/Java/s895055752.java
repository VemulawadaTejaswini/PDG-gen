
import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N  = scanner.nextLong();
        long amari = N % 11;
        int ans = 0;
        if(amari > 6)ans += 1;

        System.out.println(2 * (N / 11) + ans + 1);
    }








}


