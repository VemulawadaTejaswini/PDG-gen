import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int n = Math.abs(A - B);
        if (n % 2 == 0) {
            if (A < B) {
                System.out.println(B - n / 2);
            } else {
                System.out.println(A - n / 2);
            }
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
