import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int X = in.nextInt();

            int count = 0;
            for (int a = 0; a <= A; a++) {
                for (int b = 0; b <= B; b++) {
                    for (int c = 0; c <= C; c++) {
                        if (500 * a + 100 * b + 50 * c == X) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
