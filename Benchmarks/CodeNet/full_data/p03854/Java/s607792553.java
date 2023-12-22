import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (dps(s)) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }

    static boolean dps(String str) {
        int len = str.length();
        if (len < 5) {
            return false;
        }
        String t = str.substring(len - 5);
        if (t.equals("dream") || t.equals("erase")) {
            if (len == 5) {
                return true;
            }
            if (dps(str.substring(0, len - 5)))
                return true;
        }
        if (len < 6) {
            return false;
        }
        t = str.substring(len - 6);
        if (t.equals("eraser")) {
            if (len == 6) {
                return true;
            }
            if (dps(str.substring(0, len - 6))) {
                return true;
            }
        }
        if (len < 7) {
            return false;
        }
        t = str.substring(len - 7);
        if (t.equals("dreamer")) {
            if (len == 7) {
                return true;
            }
            if (dps(str.substring(0, len - 7))) {
                return true;
            }
        }

        return false;
    }
}