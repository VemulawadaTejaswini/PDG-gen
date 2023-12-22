import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        int l = scanner.nextInt();


        l *= 1000000;

        double base = l / 3;

        double result = Math.pow(base, 3) / 1000000;

        System.out.println(result);
    }
}