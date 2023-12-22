import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int n = sc.nextInt();
        double a = 1;
        double b = 2;
        double c = 3;
        if (n == 1) {
            System.out.println(a/a);
        } else if (n % 2 == 0) {
            System.out.println(b/a);
        } else {
            System.out.println((n/2+1)/(double)n);
        }
    }

}
