import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            String part = s.substring(l, r);
            int index = part.indexOf("AC");
            if (index >= 0) {
                part = part.replaceAll("AC", "");
            }
            System.out.println(((r - l) - part.length()) / 2);
        }
    }
}
