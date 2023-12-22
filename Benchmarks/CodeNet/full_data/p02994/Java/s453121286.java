import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int L = in.nextInt();

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += L + i;
            }

            int min = (int) 1e9;
            for (int i = 0; i < N; i++) {
                if (Math.abs(L + i) < Math.abs(min)) {
                    min = L + i;
                }
            }

            System.out.println(sum - min);
        }
    }
}
