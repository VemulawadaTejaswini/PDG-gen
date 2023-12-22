import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char tmp = s.charAt(len - 1);
            String stmp = s.substring(0, len - 1);
            s = tmp + stmp;

            if (s.equals(t)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

}