
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int a = 0;
        long count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'A') {
                ++a;
            } else if (s.charAt(i) == 'C') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'B') {
                    count += a;
                } else {
                    a = 0;
                }
            }
         //   System.out.println("i: " + i + " a: " + a + " count: " + count);
        }
        System.out.println(count);
    }
}
