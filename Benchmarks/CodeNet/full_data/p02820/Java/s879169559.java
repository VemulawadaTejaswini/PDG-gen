import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = scanner.nextInt();
        int S = scanner.nextInt();
        int P = scanner.nextInt();
        String T = scanner.next();
        char[] chars = T.toCharArray();
        char c, cc;

        long ans = 0;
        for (int i = 0; i < N; i++) {
            cc = chars[i];
            if (0 <= i - K) {
                c = chars[i - K];
                if(c == cc) {
                    chars[i] = 'x';
                    continue;
                }
            }
            if(cc == 'r') {
                ans += P;
            } else if (cc == 's') {
                ans += R;
            } else {
                ans += S;
            }
        }
//        System.out.println(chars);
        System.out.println(ans);
    }
}