import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        ArrayList<String> word_list = new ArrayList(Arrays.asList("dream", "dreamer", "erase", "eraser"));
        StringBuilder sb = new StringBuilder(S);

        boolean next_flg = true;
        while (next_flg) {
            next_flg = false;
            for (String word : word_list) {
                if (sb.toString().endsWith(word)) {
                    next_flg = true;
                    sb.delete(sb.length() - word.length(), sb.length());
                    break;
                }
            }
        }
        System.out.println("".equals(sb.toString()) ? "YES" : "NO");
    }
}