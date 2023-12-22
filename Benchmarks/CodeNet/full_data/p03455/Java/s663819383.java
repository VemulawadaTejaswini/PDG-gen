import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a * b;

        if (ans % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
