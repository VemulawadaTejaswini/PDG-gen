import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        if (sum % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(sum/2);
        }

    }
}
