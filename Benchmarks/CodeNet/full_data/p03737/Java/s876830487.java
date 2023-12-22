import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String x = sc.next();
        String y = sc.next();
        String z = sc.next();
        
        x = x.toUpperCase();
        y = y.toUpperCase();
        z = z.toUpperCase();
        
        System.out.print(x.charAt(0));
        System.out.print(y.charAt(0));
        System.out.println(z.charAt(0));
        
        sc.close();
        
    }
}
