import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        sc.close();

        BigDecimal bdA = new BigDecimal(a);
        BigDecimal bdB = new BigDecimal(b);

        if (bdA.compareTo(bdB) == 0) {
            System.out.println("EQUAL");
        } else if (bdA.compareTo(bdB) > 0) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESS");
        }
    }
}