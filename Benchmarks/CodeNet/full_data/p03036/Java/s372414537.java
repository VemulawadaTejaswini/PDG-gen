import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int D = sc.nextInt();
            int i = sc.nextInt();

            long result = calc(r, D, i);

            for (int j = 1; j < 10; j++) {
                result = calc(r, D, result);
            }

        }
    }

    static long calc(int r, int D, long i) {
        long result = r * i - D;
        System.out.println(result);
        return result;
    }

}