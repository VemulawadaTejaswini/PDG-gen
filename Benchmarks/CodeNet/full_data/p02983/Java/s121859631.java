import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int L = in.nextInt();
            int R = in.nextInt();

            if (R - L + 1 >= 2019) {
                System.out.println(2);
                return;
            }

            int min = (int) 1e9;
            for (int i = L; i < R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    min = Math.min(min, ((i % 2019) * (j % 2019)) % 2019);
                }
            }

            System.out.println(min);
        }
    }
}
