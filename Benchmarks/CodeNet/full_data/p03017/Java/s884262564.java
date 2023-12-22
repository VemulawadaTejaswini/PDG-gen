import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();

        String s1 = s.substring(a-1, c);
        String s2 = s.substring(b-1, d);
        if (s1.contains("##") || s2.contains("##")) {
            System.out.println("No");
        } else {
            s2 = s.substring(b-2, d);
            if (d < c && !s2.contains("...")) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }
}