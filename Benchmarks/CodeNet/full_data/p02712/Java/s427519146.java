import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int result = 0;
        for (int i = 1; i < N; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}