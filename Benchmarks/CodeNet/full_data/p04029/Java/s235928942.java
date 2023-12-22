
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        n = input.nextInt();
        if (n == 1) {
            System.out.print("1\nOnly one child. The answer is 1 in this case.\n");
        } else if (1 < n && n <= 6) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            System.out.print(sum + "\nThe answer is ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " + ");
            }
            System.out.println(" = " + sum);
        } else {
            if (6 < n) {
                for (int i = 1; i <= n; i++) {
                    sum = sum + i;
                }
                System.out.printf("%d\nThe sum of the integers from 1 to %d is %d. \n", sum, n, sum);
            }
        }

    }
}