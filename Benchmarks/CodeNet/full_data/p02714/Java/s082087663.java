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
        int r = 0, g = 0, b = 0;

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
        for(int i = 0; i < chars.length; i++) {
            int length = 1;
            while(i + (length * 2) < chars.length) {
                if(chars[i] != chars[length+i] &&
                chars[i] != chars[(length*2)+i] &&
                chars[length+i] != chars[(length*2)+i]) sub++;
                length++;
            }
        }

        System.out.println(sum - sub);
    }
}