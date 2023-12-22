
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();

        char current = S[0];
        int count = 1;
        for (int i = 1 ; i < N ; i++) {
            if (S[i] != current) {
                count++;
                current = S[i];
            }
        }

        System.out.println(count);
    }
}
