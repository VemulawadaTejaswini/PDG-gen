
import java.util.Scanner;

public class Main {
    char[] cs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
    }

    private void solve() {
        boolean flg = true;
        int cnt = 0;
        char[] str = "KIHBR".toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 'A')
                continue;
            if (cnt >= str.length) {
                flg = false;
                break;
            }
            flg &= cs[i] == str[cnt++];
        }
        for (int i = 0; i < cs.length - 1; i++) {
            flg &= cs[i] != cs[i+1];
        }
        flg &= cs.length <= "AKIHABARA".length();
        if (flg)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
