import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        
        int zero = 0;
        int one = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] =='0') {
                zero++;
            } else {
                one++;
            }
        }
        
        System.out.println(Math.min(zero, one) * 2);
    }
}
