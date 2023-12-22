
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        if ((S[0] == S[1] && S[2] == S[3] && S[0] != S[2])
                || (S[0] == S[2] && S[1] == S[3] && S[0] != S[1])
                || (S[0] == S[3] && S[1] == S[2] && S[0] != S[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
