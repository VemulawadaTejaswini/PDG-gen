import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        boolean isDecremented = false;
        for (int i = 0; i < n; i++) {
            int hi = sc.nextInt();
            if (max < hi) {
                max = hi;
                isDecremented = false;
            } else if ((hi < max - 1) || ((hi == max - 1) && isDecremented)) {
                System.out.println("No");
                return;
            } else if (hi == max - 1) {
                max -= 1;
                isDecremented = true;
            }
        }
        System.out.println("Yes");
    }
}
