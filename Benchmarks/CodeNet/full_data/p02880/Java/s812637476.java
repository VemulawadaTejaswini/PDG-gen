import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();

        boolean can = false;
        for (int i = 1; i <= 9; i++) {
            for (int n = 1; n <= 9; n++) {
                int sum = i * n;
                if (sum == val1) {
                    can = true;
                    break;
                }
            }
            if (can) {
                break;
            }
        }

        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}