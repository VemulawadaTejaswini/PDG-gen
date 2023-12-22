import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.next());
        double k = Double.parseDouble(scanner.next());

        if ( n  % k == 0) {
            System.out.println(0);
            System.exit(0);
        }

        if( n < k) {
            System.out.println((int)n);
            System.exit(0);
        }

        int total = (int)Math.ceil(n / k);
        System.out.println(Math.abs((int)(n - (k * total))));
    }
}
