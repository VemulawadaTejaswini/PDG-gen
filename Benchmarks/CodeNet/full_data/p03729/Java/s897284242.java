import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            if (b.substring(b.length() - 1, b.length()).equals(c.substring(0, 1))) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
