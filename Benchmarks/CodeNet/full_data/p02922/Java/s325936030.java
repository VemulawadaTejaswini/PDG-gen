
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int tapCount = 1;
        int ifCount = A;

        while (ifCount < B) {
            ifCount = ifCount + A - 1;
            tapCount++;
        }

        System.out.println(tapCount);
    }
}
