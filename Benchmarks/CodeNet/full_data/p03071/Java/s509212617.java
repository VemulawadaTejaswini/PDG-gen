import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        final String[] coinSize = input.split(" ");
        final int[] coinSizeInt = { Integer.parseInt(coinSize[0]), Integer.parseInt(coinSize[1]) };

        int score = 0;
        for (int i = 0; i < 2; i++) {
            if (coinSizeInt[0] > coinSizeInt[1]) {
                score += coinSizeInt[0];
                coinSizeInt[0]--;
            } else {
                score += coinSizeInt[1];
                coinSizeInt[1]--;
            }
        }

        System.out.println(score);
    }
}
