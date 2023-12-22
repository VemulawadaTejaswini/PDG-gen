import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        String s = scanner.next();
        int[] a = new int[s.split("1+").length + s.split("0+").length - (s.charAt(0) == '0' ? 0 : 1)];
        if (a.length == 0 || s.matches("0+")) {
            System.out.println(s.length());
            return;
        }
        Arrays.fill(a, 1);
        int i = -1;
        if (s.charAt(0) == '0') {
            a[0] = 0;
            i++;
        }
        char last = ' ';
        for (char ch : s.toCharArray()) {
            if (ch == last) {
                a[i]++;
            } else {
                i++;
            }
            last = ch;
        }
        int[] sum = new int[a.length];
        for (int j = 0; j <= Math.min(k * 2, a.length - 1); j++) {
            sum[0] += a[j];
        }
        for (int j = 2; j < a.length - k * 2; j += 2) {
            sum[j / 2] = sum[j / 2 - 1] - a[j - 1] - a[j - 2] + a[j + k * 2 - 1] + a[j + k * 2];
        }

        Arrays.stream(sum).max().ifPresent(System.out::println);
    }
}