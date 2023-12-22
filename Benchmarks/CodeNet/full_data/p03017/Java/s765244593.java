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
        if (c == d) {
            System.out.println("No");
            return;
        }
        // 跨がなくていい＝a->c,b->dにいければOK
        if (c < d) {
            String s1 = s.substring(b,d);
            String s2 = s.substring(a,c);
            if (s1.contains("##") || s2.contains("##")) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            // 跨がないとダメ=...となるところが必要.
            String s1 = s.substring(b,d);
            if (s1.contains("...") && !s1.contains("##")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}