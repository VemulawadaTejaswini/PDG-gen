import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            left = Math.max(left, scanner.nextInt());
            right = Math.min(right, scanner.nextInt());
        }

        System.out.println(Math.max(0, (right - left) + 1));
    }
}