import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        long k = sc.nextLong();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if ((long)(i + 1) == k) {
                    System.err.println(1);
                    break;
                }
            }
            else {
                System.err.println(s.charAt(i));
                break;
            }
        }
    }
}
