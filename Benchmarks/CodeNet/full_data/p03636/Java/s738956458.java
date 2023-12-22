package l.i18n;

import java.util.Scanner;

public class LI18n {

    public static void main(String[] args) {
        int count = 0;

        Scanner s = new Scanner(System.in);
        String a = s.next();
        char r = a.charAt(0);
        char r2 = a.charAt(a.length() - 1);

        for (int i = 2; i < a.length(); i++) {
            count++;
        }
        System.out.println(r + "" + count + "" + r2);

    }

}
