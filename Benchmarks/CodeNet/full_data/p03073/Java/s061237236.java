import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        String s = sc.nextLine();

        int l = s.length();

        String ans1, ans2;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i=0; i < l; i++) {
            sb1.append(i % 2 == 0 ? "1" : "0");
            sb2.append(i % 2 != 0 ? "1" : "0");
        }

        ans1 = sb1.toString();
        ans2 = sb2.toString();

        int d1 = distance(s, ans1);
        int d2 = distance(s, ans2);

        System.out.println(d1 > d2 ? d2 : d1);

    }

    private static int distance(String s, String target) {
        int c = 0;
        char[] s1 = s.toCharArray();
        char[] s2 = target.toCharArray();
        for (int i=0; i < s.length(); i++) {
            if (s1[i] != s2[i])
                c++;
        }
        return c;
    }

}
