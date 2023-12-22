import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();
            int k = 0;
            for (int n = 1;; n++) {
                if (A % n == 0 && B % n == 0) {
                    k++;
                    if (k >= K) {
                        System.out.println(n);
                        return;
                    }
                }
            }
        }
    }
}
