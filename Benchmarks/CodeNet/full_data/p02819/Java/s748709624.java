import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int num = k;
        while (!isPrimeNumber(num)) {
            num++;
        }
        System.out.println(num);
    }

    static boolean isPrimeNumber(int n) {
        return IntStream.range(2, n).allMatch(m -> n % m != 0);
    }
}
