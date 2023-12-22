import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Set<String> words = new HashSet<>();
        String lastWord = null;
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            if (lastWord != null && lastWord.charAt(lastWord.length() - 1) != str.charAt(0)) {
                System.out.println("No");
                return;
            }
            if (!words.add(str)) {
                System.out.println("No");
                return;
            }
            lastWord = str;
        }
        System.out.println("Yes");
    }
}