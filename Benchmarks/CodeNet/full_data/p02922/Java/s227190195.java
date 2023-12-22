import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println(1);
            System.exit(0);
        }
        int ans = b/a;
        int rem = b%(a-1);
        if (rem != 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
