import java.io.IOException;
import java.util.Scanner;

class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(final String[] args) throws IOException {
            String s = scanner.nextLine();
            int ans = 0;
            for (int i = 0; i < (s.length()/2); i++) {
                if (!s.substring(i, i + 1).equals(s.substring(s.length()-i -1, s.length()-i))) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
}
