import java.util.Scanner;

public class ABC333 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        printOutcome(A, B);
    }

    private static void printOutcome(int A, int B) {


        String outcome = ((A * B) % 2 == 0) ? "NO" : "YES";

        System.out.println(outcome);

    }
}
