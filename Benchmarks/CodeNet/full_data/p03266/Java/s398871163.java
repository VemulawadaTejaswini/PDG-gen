import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int x = 0;
        int y = 0;

        for (int i = 1; i <= n; i++) {
            if (i%k == 0)
                x++;
        }

        if (k % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i%k == k/2)
                    y++;
            }
        }

        System.out.println(x*x*x + y*y*y);
    }
}
