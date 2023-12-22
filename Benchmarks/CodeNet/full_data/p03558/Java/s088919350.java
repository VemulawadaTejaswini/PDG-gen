import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int K = in.nextInt();

            int min = (int) 1e9;
            for (int i = 1; i < 1e9; i++) {
                int k = K * i;
                int sum = 0;
                for (; k > 0;) {
                    sum += k % 10;
                    k /= 10;
                }
                if (sum < min) {
                    min = sum;
                }
            }

            System.out.println(min);
        }
    }

}
