import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int y = in.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int totalYen = i * 10000 + j * 5000 + (n - i - j) * 1000;
                if (totalYen == y) {
                    System.out.print(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}