import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        
        double a = L/3;
        double b = a*a*a;
        
        System.out.println(BigDecimal.valueOf(a*a*a).toPlainString());
        
    }
}
