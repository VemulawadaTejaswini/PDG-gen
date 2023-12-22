import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int tmp;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            if (tmp == 1) {
                minIndex = i;
            }
        }

        int before = minIndex / (k - 1);
        int after = (n - minIndex - 1) / (k - 1);
        int center = n - (before + after) * (k - 1);

        int result = before + after;

        if (center > 1) {
            result += 1;
        }

        System.out.println(result);
    }
}
