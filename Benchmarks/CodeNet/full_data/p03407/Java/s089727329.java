import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if(a + b < c) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
