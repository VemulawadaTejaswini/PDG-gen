import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int x = scanner.nextInt();
        int pos = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (pos <= x) {
                ans++;
            }
            pos += scanner.nextInt();
        }
        System.out.println(ans);
    }
}
