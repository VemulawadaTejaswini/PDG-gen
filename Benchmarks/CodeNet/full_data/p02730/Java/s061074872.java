import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rs = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rs += s.charAt(i);
        }

        String prev = s.substring(0, (s.length() - 1) / 2);
        String rprev = "";
        for (int i = prev.length() - 1; i >= 0; i--) {
            rprev += prev.charAt(i);
        }

        String after = s.substring(((s.length() + 3) / 2) - 1);
        String rafter = "";
        for (int i = after.length() - 1; i >= 0; i--) {
            rafter += after.charAt(i);
        }

        if (s.equals(rs) && prev.equals(rprev) && after.equals(rafter)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}