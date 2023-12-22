import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        List<String> dict = new ArrayList<>();
        dict.add("remaerd");
        dict.add("resare");
        dict.add("maerd");
        dict.add("esare");

        int pos = s.length() - 1;
        while (pos >= 0) {
            boolean found = false;
            for (String word : dict) {
                int j = pos;
                int k = 0;

                while (k < word.length() && j >= 0 && word.charAt(k++) == s.charAt(j--)) ;
                if (k == word.length()) {
                    pos -= k;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
