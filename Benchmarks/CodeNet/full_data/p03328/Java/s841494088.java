import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        solve();
    }

    public static void solve() {
        int bHeight = IntStream.rangeClosed(1, b - a).sum();
        System.out.println(bHeight - b);
    }
}
