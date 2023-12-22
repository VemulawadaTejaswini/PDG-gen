import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();

            for (int i = s.length() - 1 - 1; i >= 0; i--) {
                String sub = s.substring(0, i);
                if (isEven(sub)) {
                    System.out.println(sub.length());
                    break;
                }
            }

            System.out.println(-1);
        }
    }

    private static boolean isEven(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        int l = s.length() / 2;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != s.charAt(l + i)) {
                return false;
            }
        }

        return true;
    }
}
