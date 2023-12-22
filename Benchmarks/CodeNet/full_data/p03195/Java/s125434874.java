import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }
        boolean isFirst = false;
        for (int i = 0; i < n; i++) {
            boolean isOdd = as[i] % 2 == 1;
            if (isOdd) {
                isFirst = true;
            }
        }

        if (isFirst) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
    }
}
