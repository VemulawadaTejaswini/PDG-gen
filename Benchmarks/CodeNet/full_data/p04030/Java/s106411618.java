import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        String ans = "";
        for (int i=0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == 'B') {
                if (! ans.isEmpty()) ans = ans.substring(0, ans.length() - 1);
            } else {
                ans = ans + ch;
            }
        }

        System.out.println(ans);
    }
}
