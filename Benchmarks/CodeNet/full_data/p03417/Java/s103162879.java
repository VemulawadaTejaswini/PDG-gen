import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (n == 1) {
                    if (j != 0 && j != m-1) {
                        c++;
                    }
                }
                else if (i != 0 && i != n-1 && j != 0 && j != m-1) {
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
