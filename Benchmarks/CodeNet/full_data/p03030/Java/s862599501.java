import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][3];

        for (int i = 0; i < n; i++) {
            s[i][0] = String.valueOf(i + 1);
            s[i][1] = sc.next();
            s[i][2] = sc.next();
        }

        Arrays.sort(s, (a, b) -> {
            if (a[1].equals(b[1])) return Integer.parseInt(b[2]) - Integer.parseInt(a[2]);
            return a[1].compareTo(b[1]);
        });

        for (int i=0;i<n;i++) {
            System.out.println(s[i][0]);
        }
    }
}