import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isEasyToTap(s) ? "Yes" : "No");
    }

    private static boolean isEasyToTap(String s) {
        char[] ca = s.toCharArray();
        int l = ca.length;
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                if (ca[i] == 'L') {
                    return false;
                }
            } else {
                if (ca[i] == 'R') {
                    return false;
                }
            }
        }
        return true;
    }
}
