import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int xCount = 0;
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i, i + 1);
            if (tmp.equals("x")) {
                if (!(s.length() % 2 == 1 && i == (s.length() - 1) / 2)) {
                    xCount++;
                }
            } else {
                newStr += tmp;
            }
        }

        if (newStr.length() == 0) {
            System.out.println(0);
        } else if (check(newStr)) {
            System.out.println(xCount);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean check(String s) {
        int l = s.length();
        if (l % 2 == 1) {
            for (int i = 0; i < (l - 1) / 2; i++) {
                if (!s.substring(i, i + 1).equals(s.substring(l - 1 - i, l - i))) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < l / 2; i++) {
                if (!s.substring(i, i + 1).equals(s.substring(l - 1 - i, l - i))) {
                    return false;
                }
            }
        }
        return true;
    }
}