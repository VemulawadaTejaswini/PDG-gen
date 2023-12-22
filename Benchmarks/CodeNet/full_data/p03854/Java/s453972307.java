import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().trim().toCharArray();
        int length;

        while ((length = s.length) > 0) {
            String t = new String(s);
            if (t.endsWith("dream") || t.endsWith("erase")) {
                s = t.substring(0, length - 5).toCharArray();
                continue;
            }
            if (t.endsWith("eraser")) {
                s = t.substring(0, length - 6).toCharArray();
                continue;
            }
            if (t.endsWith("dreamer")) {
                s = t.substring(0, length - 7).toCharArray();
                continue;
            }
            System.out.println("NO");
            System.exit(0);
        }
        if (s.length > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}