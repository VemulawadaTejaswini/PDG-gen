import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println(a == b ? c : b == c ? a : b);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
