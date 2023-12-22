import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int pileSize = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        boolean[] canWin = new boolean[pileSize + 1];

        for (int i = 1; i <= pileSize; ++i) {
            for (int move : arr) {
                if (move <= i) {
                    if (!canWin[i - move]) {
                        canWin[i] = true;
                    }
                }
            }
        }

        System.out.println(canWin[pileSize] ? "First" : "Second");
    }
}
