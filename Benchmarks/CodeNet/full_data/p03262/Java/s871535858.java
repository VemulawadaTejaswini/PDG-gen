import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();

        for (int k = 1;k <= n; k++) {

            for (int i = 1; i > 0; i++) {
                int x = sc.nextInt();
                int s = Math.abs(X - x);

                if (s % i != 0) {
                    System.out.println(i - 1);
                    break;
                }

            }
        }
    }
}





