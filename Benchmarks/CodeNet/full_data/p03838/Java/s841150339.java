import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long x = scan.nextInt();
        long y = scan.nextInt();
        long answer = Long.MAX_VALUE;
        long step1 = step1(x, y);
        if (0 < step1) {
            answer = Math.min(answer,step1);
        }
        long step2 = step2(x, y);
        if (0 < step2) {
            answer = Math.min(answer,step2);
        }
        long step3 = step3(x, y);
        if (0 < step3) {
            answer = Math.min(answer,step3);
        }
        long step4 = step4(x, y);
        if (0 < step4) {
            answer = Math.min(answer,step4);
        }
        System.out.println(answer);
    }
    private long step1(long x, long y) {
        if (x <= y) {
            return y - x;
        }
        return -1;
    }
    private long step2(long x, long y) {
        if (-x < y) {
            return y + x + 1;
        }
        if (-x == y) {
            return 1;
        }
        return -1;
    }
    private long step3(long x, long y) {
        if (x < -y) {
            return - y - x + 1;
        }
        if (x == -y) {
            return 1;
        }
        return -1;
    }
    private long step4(long x, long y) {
        if (-x < -y) {
            return - y + x + 2;
        }
        return -1;
    }
}
