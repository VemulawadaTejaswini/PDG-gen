import java.util.Scanner;

public class Main {
    static Scanner in;

    void solve() {
        String string = in.nextLine();
        if(string.indexOf("AC") >= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
