import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();

        long min = Long.MAX_VALUE;
        for (long i = L; i < R; i++) {
            for (long k = i+1; k <= R; k++) {
                long result = mod2019(i * k);
                if (result < min) {
                    min = result;
                    if (min <= 0) {
                        System.out.println("0");
                        return;
                    }
                }
            }
        }
        System.out.println(min);
    }

    private static long mod2019(long hoge) {
        return hoge % 2019;
    }
}