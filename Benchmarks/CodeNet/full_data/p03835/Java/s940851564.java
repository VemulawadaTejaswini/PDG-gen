import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.next());
        int S = Integer.parseInt(scanner.next());
        scanner.close();

        int ans = 0;
        for (int x = 0; x <= K; x++) {
            for (int y = 0; y <= K; y++) {
                if (x + y == S) {
                    ans++;
                    break;
                }
                for (int z = 0; z <= K; z++) {
                    if (x + y + z == S) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
