import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder tb = new StringBuilder();
        String[] ts = {"dream", "dreamer", "erase", "eraser"};
        boolean flag = true;
        while (tb.length() < s.length()) {
            if (!flag)
                break;
            for (String t :
                    ts) {
                if (s.startsWith(t, tb.length())) {
                    flag = true;
                    tb.append(t);
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