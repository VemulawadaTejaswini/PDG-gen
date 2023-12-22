import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        if (!isKaibun(s)) {
            System.out.println("No");
            return;
        }

        String head = s.substring(0, (s.length() - 1) / 2);
        String tail = s.substring(((s.length() + 3) / 2) - 1, s.length());

        if (isKaibun(head) && isKaibun(tail)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    private static boolean isKaibun(String s) {
        for (int i = 0; i < (s.length() / 2); i++) {
            char[] chars = s.toCharArray();
            if (chars[i] == chars[s.length() - 1 - i]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
