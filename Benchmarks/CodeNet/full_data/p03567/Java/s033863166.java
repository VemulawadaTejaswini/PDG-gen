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
        boolean flg = false;
        for (int i = 0; i < cs.length-1; i++) {
            if (cs[i] == 'A' && cs[i+1] == 'C')
                flg = true;
        }
        if (flg)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
