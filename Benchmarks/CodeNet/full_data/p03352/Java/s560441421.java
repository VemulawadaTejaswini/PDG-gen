import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();

            boolean[] isBeki = new boolean[X + 1];
            isBeki[1] = true;
            bLoop: for (int b = 2; b < Math.sqrt(X) + 1; b++) {
                for (int n = b * b;; n *= b) {
                    if (n > X) {
                        continue bLoop;
                    }
                    isBeki[n] = true;
                }
            }

            for (int i = X; i >= 1; i--) {
                if (isBeki[i]) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
