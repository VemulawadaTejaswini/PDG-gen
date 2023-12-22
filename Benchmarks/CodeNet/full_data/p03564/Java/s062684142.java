import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 1;

        int a_result = 0;
        int b_result = 0;

        for (int i = 0; i < n; i++) {
            a_result = ans * 2;
            b_result = ans + k;

            ans = a_result < b_result ? a_result : b_result;
        }

        System.out.println(ans);
    }
}