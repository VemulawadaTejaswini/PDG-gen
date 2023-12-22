import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        boolean a = false;
        boolean b = false;
        for (int i = 0; i < s.length; i++) {
            if ("A".equals(s[i])) {
                a = true;
            } else {
                b = true;
            }
        }

        if (a && b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
