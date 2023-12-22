import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int tax8 = (int) (i * 0.08);
            int tax10 = (int) (i * 0.1);
            if (a == tax8 && b == tax10) {
                System.out.println(i);
                return;
            }
            if (a < tax8 || b < tax10) {
                System.out.println("-1");
                return;
            }
        }
    }
}
