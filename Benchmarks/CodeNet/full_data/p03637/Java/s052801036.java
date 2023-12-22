import java.util.Scanner;

public class Main {
    static int n;
    static int[] g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int multiple2 = 0;
        int multiple4 = 0;
        int other= 0;
        for (int i = 0; i < n; i++) {
            long num = sc.nextInt();
            if (num % 4 == 0) {
                multiple4++;
            } else if (num % 2 == 0) {
                multiple2++;
            } else {
                other++;
            }
        }
        if (multiple4 * 2 < other || (multiple2 == 1 && multiple4 < other)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
