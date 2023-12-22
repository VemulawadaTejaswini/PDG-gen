
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();


        // 1. 白を黒にする場合
        int left = n - 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '#') {
                 left = i;
                 break;
            }
        }

        int countL = 0;
        for (int i = left; i < n; i++) {
            if (s.charAt(i) == '.') {
                countL++;
            }
        }

        // 2. 黒を白にする場合
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '.') {
                right = i;
            }
        }

        int countR = 0;
        for (int i = 0; i < right; i++) {
            if (s.charAt(i) == '#') {
                countR++;
            }
        }

        System.out.println(Math.min(countR, countL));
    }
}
