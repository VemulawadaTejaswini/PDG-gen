
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String ans = s1.charAt(0) + s2.charAt(0);
        ans += s3.charAt(0);
        System.out.println(ans.toUpperCase());
    }
}