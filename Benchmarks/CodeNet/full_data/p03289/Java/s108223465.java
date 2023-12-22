

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        boolean result = false;

        int indexC = s.indexOf("C");

        if ("A".equals(s.substring(0, 1)) && indexC >= 2 && indexC <= s.length() - 2 && !onemoretime(s, 'C')) {
            s = s.replace("A", "");
            s = s.replace("C", "");
            String pattern = "^[a-z]+$";
            Pattern p = Pattern.compile(pattern);
            if (p.matcher(s).find()) {
                result = true;
            }
        }
        System.out.println(result ? "AC" : "WA");

    }

    static boolean onemoretime(String str, char target) {
        return str.length() - str.replace(target + "", "").length() > 1;
    }
}
