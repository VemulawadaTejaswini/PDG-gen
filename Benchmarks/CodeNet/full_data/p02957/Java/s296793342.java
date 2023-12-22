import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 0; i <= 1000000000; i++) {
            if (Math.abs(A - i) == Math.abs(B - i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}