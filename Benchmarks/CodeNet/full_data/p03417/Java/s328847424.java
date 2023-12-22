import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if (n > 2 && m > 2) {
            System.out.println((n-2) * (m-2));
        } else if (n > 2 || m > 2) {
            if (n > 2) {
                System.out.println((n-2));
            } else {
                System.out.println((m-2));
            }
        } else {
            System.out.println(0);
        }
    }
}
