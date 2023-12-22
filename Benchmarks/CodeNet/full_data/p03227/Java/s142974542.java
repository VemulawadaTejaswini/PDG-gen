import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() == 2) {
            System.out.println(s);
        } else if(s.length() == 3) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String tmp = sb.toString();
            System.out.println(tmp);
        }
    }
}