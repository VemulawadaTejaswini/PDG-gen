import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = s.length();

        if(check(s) && check(s.substring(0, (m-1)/2)) && check(s.substring((m+3)/2-1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(String s) {
        String s1 = s.substring(0, (s.length()-1)/2);
        String s2 = s.substring(((s.length()+1)/2));
//       System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println();
        return s1.equals(s2);
    }
}