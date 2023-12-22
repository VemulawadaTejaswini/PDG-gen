import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String _str[] = str.split(" ", 0);
        int a = Integer.parseInt(_str[0]);
        int b = Integer.parseInt(_str[1]);
        int c = Integer.parseInt(_str[2]);
        
        double d = Math.sqrt(a) + Math.sqrt(b);
        double e = Math.sqrt(c);
        
        if(d < e) {
            System.out.println("Yes");
            
        } else {
            System.out.println("No");
            
        }
        
    }
}
