import java.util.*;

class Main {
    static String[] strs = {
        "dream",
        "dreamer",
        "erase",
        "eraser"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int index = S.length();
        while (true) {
            boolean endsWithStr = false;
            for (String str: strs) {
                if (S.substring(0, index).endsWith(str)) {
                    endsWithStr = true;
                    index -= str.length();
                    break;
                }
            }
            if (!endsWithStr) {
                System.out.println("NO");
                break;
            }
            if (index == 0) {
                System.out.println("YES");
                break;
            }
        }
    }
}
