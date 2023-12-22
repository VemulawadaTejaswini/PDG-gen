
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();
        if (S[2] == S[3] && S[4] == S[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
   }
}
