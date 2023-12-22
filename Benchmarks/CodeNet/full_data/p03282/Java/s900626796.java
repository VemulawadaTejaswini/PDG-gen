import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String S = scanner.next();
            long  K = scanner.nextLong();
            int firstNonOne = -1;
            char firstNonOneChar = 'n';
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c != '1') {
                    firstNonOne = i;
                    firstNonOneChar = c;
                    break;
                }
            }
            if (K <= firstNonOne ) {
                System.out.println(1);
            } else {
                System.out.println(firstNonOneChar);
            }
        }
    }
}
