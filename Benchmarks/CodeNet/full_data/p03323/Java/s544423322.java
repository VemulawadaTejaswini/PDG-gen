import java.util.Scanner;

public class Main {

    static int A;
    static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        solve();
    }

    public static void solve() {

        if (A <= 8 && B <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
