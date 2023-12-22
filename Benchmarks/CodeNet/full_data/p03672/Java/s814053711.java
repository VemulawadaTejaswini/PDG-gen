import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        s = s.substring(0, s.length() - 1);

        boolean flg = true;

        while (flg) {
            String top = s.substring(0, s.length() / 2);
            String bottom = s.substring(s.length() / 2);
            if (top.equals(bottom)) {
                flg = false;
            } else {
                s = s.substring(0, s.length() - 1);
            }
        }

        System.out.println(s.length());

    }
}