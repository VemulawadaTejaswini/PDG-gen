import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        StringBuilder sb = new StringBuilder(S);

        S = sb.reverse().toString();

        // dream, dreamer, erase, eraser

        String[] keywords = {
                "dream", "dreamer", "erase", "eraser"
        };

        List<String> reversedKeywords = new ArrayList();

        for (String s : keywords) {
            reversedKeywords.add((new StringBuilder(s)).reverse().toString());
        }

        int fromIndex = 0;
        while (true) {
            boolean found = false;
            for (String reversed : reversedKeywords) {
                if (S.indexOf(reversed, fromIndex) != -1) {
                    fromIndex += reversed.length();
                    found = true;
                    break;
                }
            }
            if (fromIndex == S.length()) {
                System.out.println("YES");
                return;
            }
            if (!found) {
                System.out.println("NO");
                return;
            }
        }
    }
}