import java.util.Scanner;

// D - Caracal vs Monster
// https://atcoder.jp/contests/abc153/tasks/abc153_d
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = Long.parseLong(scanner.next());
        scanner.close();

        System.out.println(f(H));
    }

    private static long f(long H) {
        if (H == 1) return 1;
        return f(H / 2) * 2 + 1;
    }
}
