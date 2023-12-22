import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = false;
        for (int i=1; i<=9; i++) {
            if (n % i == 0) {
                int shou = n / i;
                if (shou <= 9) {
                    result = true;
                    break;
                }
            }
        }
        System.out.print(result ? "Yes" : "No");
    }
}