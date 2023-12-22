import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int max = A;
        int mid = A;
        int min = A;
        if (B > max) {
            max = B;
        } else {
            mid = B;
        }
        if (C > max) {
            max = C;
        } else if (C > mid) {
            min = mid;
            mid = C;
        } else {
            min = C;
        }

        // 2つ選んで、１増やす回数
        int count = max - mid;

        // 1つ選んで、2増やす回数
        int s = max - (min + count);

        if (s % 2 == 0) {
            count += s / 2;
        } else {
            count += s / 2 + 2;
        }

        System.out.println(count);
    }
}