import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = Long.parseLong(sc.next());
        long NUM = 5_000_000_000_000_000L;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && k == i + 1) {
                System.out.println(s.charAt(i));
                return;
            }
            if (s.charAt(i) != '1') {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(1);
    }
}