import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        List<String> T = new ArrayList<String>();
        T.add("dream");
        T.add("dreamer");
        T.add("erase");
        T.add("eraser");


        boolean flag;
        while (true) {
            flag = false;
            if (S.length() == 0) break;
            for (String t: T) {
                if (S.endsWith(t)) {
                    S = S.substring(0, S.length() - t.length());
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
