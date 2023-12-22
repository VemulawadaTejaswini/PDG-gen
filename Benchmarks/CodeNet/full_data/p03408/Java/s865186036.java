import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String[] s = new String[n];
        int m = scanner.nextInt();
        String[] t = new String[m];

        int max = 0;
        for (int i = 0; i < n; i++) {
            int money = 0;
            for (int j = 0; j < n; j++) {
                if (s[i].equals(s[j])) {
                    money++;
                }
            }
            for (int j = 0; j < m; j++) {
                if (s[i].equals(t[j])) {
                    money--;
                }
            }
            max = Math.max(max, money);
        }
        System.out.println(max);
    }
}