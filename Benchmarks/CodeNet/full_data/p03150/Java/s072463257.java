import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = "keyence";

        if (s.contains(target)) {
            System.out.println("YES");
            return;
        }

        for (int i = 1; i < target.length() - 1; i++) {
            int fi;
            if ((fi = s.indexOf(target.substring(0, i))) == - 1) {
                continue;
            }
            if (s.indexOf(target.substring(i), fi + i) > 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}