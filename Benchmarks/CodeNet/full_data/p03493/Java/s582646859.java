import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
