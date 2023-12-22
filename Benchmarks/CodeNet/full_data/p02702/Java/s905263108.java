import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int ans = 0;

        Loop: for (int i = 0; i < input.length() - 4; i++) {
            for (int j = i + 4; j < input.length(); j++) {
                try {
                    String sub = input.substring(i, j + 1);
                    if (Long.parseLong(sub) % 2019l == 0) {
                        ans++;
                    }
                } catch (Exception e) {
                    continue Loop;
                }
            }

        }

        System.out.println(ans);

    }
}
