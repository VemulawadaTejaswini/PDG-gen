import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0;
        int numCount = 1;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num != numCount) {
                count++;
            } else {
                numCount++;
            }
        }
        scanner.close();

        if (count != N) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }

    }
}
