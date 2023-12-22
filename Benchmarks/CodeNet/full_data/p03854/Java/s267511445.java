import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder tb = new StringBuilder(s);
        String[] ts = {"dreamer", "dream", "eraser", "erase"};
        boolean flag = true;
        while (tb.length() > 0) {
            if (!flag)
                break;
            for (String t :
                    ts) {
                if (tb.toString().endsWith(t)) {
                    flag = true;
                    tb.delete(tb.length()-t.length(),tb.length());
                    break;
                }
                else {
                    flag = false;
                }
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}