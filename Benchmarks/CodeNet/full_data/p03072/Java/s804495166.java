import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int counter = scanner.nextInt();
        final int[] mountains = new int[counter];

        int res = 1;
        for (int i = 1; i < counter; i++) {
            if (mountains[i] > mountains[i - 1]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
