import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;
        int[] subResults = new int[n];
        for (int i = 0; i < n; i++) {
            subResults[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            subResults[i] -= scanner.nextInt();
            if (subResults[i] > 0) {
                result += subResults[i];
            }
        }
        System.out.println(result);
    }
}
