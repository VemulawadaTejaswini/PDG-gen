import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String s2 = s+s;
        String t2 = t;
        while (s2.length() < t2.length()) {
            s2 += s;
        }
//        System.out.println(s2);
//        System.out.println(t2);

        String s3 = s2;
        while (s3.length() < t2.length() * 2) {
            s3 += s2;
        }
        if (s3.startsWith(t2+t2)) {
            System.out.println("-1");
            return;
        }

        int ans = 0;
        while (s2.contains(t2)) {
//            System.out.println(s2);
//            System.out.println(t2);
            ans++;
            t2 += t;
        }
        System.out.println(ans);
    }
}
