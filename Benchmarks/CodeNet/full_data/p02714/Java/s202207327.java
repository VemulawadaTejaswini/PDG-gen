import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        char[] chars = S.toCharArray();
        long r = 0, g = 0, b = 0;

        for (int i = 0; i < S.length(); i++) {
            if (chars[i] == 'R') {
                r++;
            } else if (chars[i] == 'B') {
                b++;
            } else {
                g++;
            }
        }
        long sum = r * g * b;
        long sub = 0;
        for (int i = 0; i < chars.length; i++) {
            int length = 1;
            while (i + (length * 2) < chars.length) {
                int j = length + i;
                int k = (length * 2) + i;
                if (chars[i] != chars[j] &&
                        chars[i] != chars[k] &&
                        chars[j] != chars[k]) sub++;
                length++;
            }
        }

        System.out.println(sum - sub);
    }
}