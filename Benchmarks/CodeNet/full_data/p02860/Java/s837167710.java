import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        String S = scanner.next();

        scanner.close();

        if (N % 2 == 1) {
            System.out.println("No");
            return;
        }

        String firstHalf = S.substring(0, N / 2);
        String lastHalf = S.substring(N / 2, N);

        System.out.println(firstHalf.equals(lastHalf) ? "Yes" : "No");
    }
}
