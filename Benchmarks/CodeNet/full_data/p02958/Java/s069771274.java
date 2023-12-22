import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= a; i++) {
            int tmp = sc.nextInt();
            if (tmp != i) result++;
        }

        if (result == 0 || result == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
