import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int ans = 0;
        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {
                for (int z = 0; z <= k; z++) {
                    if (x + y + z == s) ans++;
                }
            }
        }
        System.out.println(ans);
    }

}