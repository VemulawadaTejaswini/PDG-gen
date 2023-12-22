
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int a = 0;
        int bc = 0;
        long count = 0;
        int i = 0;
        while (i < s.length()) {
            boolean isUpdate = false;
            boolean isAUsed = false;
            while (i < s.length() && s.charAt(i) == 'A') {
                ++a;
                ++i;
                isUpdate = true;
            }
            bc = 0;
            while (i + 1 < s.length() && s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
                ++bc;
                i += 2;
                isUpdate = true;
                isAUsed = true;
            }
            if (isUpdate && isAUsed) {
                count += bc * a;
            }
            if (isUpdate == false) {
                ++i;
            }
            if (isAUsed == false) {
                a = 0;
            }
        }
        System.out.println(count);
    }
}
