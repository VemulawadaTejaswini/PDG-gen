
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int count = 0;

        for (int i = 1 ; i <= N ; i++) {
            if (String.valueOf(i).length() % 2 == 1) count++;
        }

        System.out.println(count);
    }
}
