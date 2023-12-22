import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String[] T = {
            "dream",
            "dreamer",
            "erase",
            "eraser"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();


        while (true) {
            boolean flag = false;
            for (String t : T) {
                if (S.endsWith(t)) {
                    flag = true;
                    S = S.substring(0, S.length() - t.length());
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
                break;
            }
            if (S.length() <= 0) {
                System.out.println("YES");
                break;
            }
        }
    }
}
