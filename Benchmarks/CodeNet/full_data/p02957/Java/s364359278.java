import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, k;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        for (k = a; k <= b; k++) {
            if (Math.abs(a - k) == Math.abs(b - k)) {
                System.out.println(k);
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
