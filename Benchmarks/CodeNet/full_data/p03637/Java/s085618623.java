import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul4 = 0;
        int mul2 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0) {
                mul4++;
            } else if (a % 2 == 0) {
                mul2++;
            }
        }
        if (mul2 >= 2) {
            n = n - mul2;
        }
        if (n == 1 && mul4 < 1) {
            System.out.println("No");
        } else if (n == 0 || mul4 >= n / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}