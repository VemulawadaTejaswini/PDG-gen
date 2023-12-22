import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int x;
    static int y;
    static int z;


    public static void main(String[] args) {
        read();
        solve();
    }

    public static void read() {
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }

    public static void solve() {
        int sum = 0;
        int count = 0;
        sum += y;
        while (sum < x) {
            count++;
            sum += z;
            sum += y;

        }
        System.out.println(count);
    }
}
