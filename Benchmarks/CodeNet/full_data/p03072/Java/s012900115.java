import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int counter = scanner.nextInt();
        final int[] mountains = new int[counter];

        for (int i = 0; i < counter; i++) {
            mountains[i] = scanner.nextInt();
        }

        int res = 1;
        for (int i = 1; i < counter; i++) {
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (mountains[i] < mountains[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res++;
            }
        }
        System.out.println(res);
    }
}
