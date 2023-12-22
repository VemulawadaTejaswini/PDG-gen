
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        int count = 0;
        int l = S.length - 1;
        for (int i = 0 ; i * 2 < S.length ; i++) {
            if (S[i] != S[l - i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
