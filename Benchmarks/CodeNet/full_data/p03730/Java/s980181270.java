import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int initRem = a % b;
        if (initRem == c) {
            System.out.println("YES");
            return;
        }
        int n = a + a;
        while (true) {
            if (n % b == c) {
                System.out.println("YES");
                return;
            }
            if (n % b == initRem) {
                System.out.println("NO");
                return;
            }
            n = n + a;
        }
    }
}
