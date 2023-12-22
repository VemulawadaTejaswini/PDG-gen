import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int maxLen = 0;
            int lastPos = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'A' || c == 'C' || c == 'G'|| c== 'T') {
                    maxLen = Math.max(maxLen, i - lastPos + 1);
                } else {
                    lastPos = i + 1;
                }
            }
            System.out.println(maxLen);
        }
    }
}
