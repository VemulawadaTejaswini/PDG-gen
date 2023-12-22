import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        if (n % 2 == 1) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < n / 2; i++) {
            if (str[i] != str[n / 2 + i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}