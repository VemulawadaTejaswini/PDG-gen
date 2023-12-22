import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int count = 1;
        for (int i = 0, j = 0; i < n; i++) {
            j += scanner.nextInt();
            if (j <= x) {
                count++;
            }
        }
        System.out.println(count);
    }
}