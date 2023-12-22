
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        if (A + B == C || A + C == B || B + C == A) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
