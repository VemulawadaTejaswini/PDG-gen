import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        long k = sc.nextLong();

        if (k == 1) {
            if (s.charAt(0) == '1') {
                System.out.println(1);
            }
        } else {
            if (s.length() > 1)
                System.out.println(s.charAt(1));
            else
                System.out.println(s.charAt(0));
        }
    }
}
