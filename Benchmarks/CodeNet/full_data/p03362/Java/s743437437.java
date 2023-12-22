import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        if (N % 2 == 0) {
            sb.append(2);
            sb.append(' ');
            N--;
        }
        int p = 3;
        while (N > 0) {
            boolean prime = true;
            for (int i = 2; i * i <= p; i++) {
                if (p % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sb.append(p);
                sb.append(' ');
                N--;
            }
            p++;
        }
        System.out.println(sb.toString().trim());
    }

}