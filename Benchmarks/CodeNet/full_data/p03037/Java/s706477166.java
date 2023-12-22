import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        for(int i = 0; i < M; i++) {
            left = Math.max(left, scanner.nextInt());
            right = Math.min(right, scanner.nextInt());
        }

        System.out.println(Math.max(0, right - left + 1));
    }
}
