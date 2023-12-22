import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0) {
                c1++; 
            } else if (a % 2 == 0) {
                c2++;
            }
        }

        if (c1 >= n / 2) {
            System.out.println("Yes");
        } else {
            if (c2 == n - 2 * c1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}