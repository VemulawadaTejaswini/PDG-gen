import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double cnt = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 3 != 0 && i % 5 != 0)
                cnt += i;
        }
        System.out.println(cnt);
    }
}
