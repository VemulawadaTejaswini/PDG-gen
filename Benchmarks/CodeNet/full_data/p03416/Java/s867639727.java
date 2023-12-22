import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        int a = in.nextInt(), b = in.nextInt();
        int ans = 0;
        for(int i = a; i <=b; i++) {
            String s = String.valueOf(i);
            String t = new StringBuilder(s).reverse().toString();
            if(t.equals(s)) {
                ans ++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
