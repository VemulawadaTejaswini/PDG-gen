import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int result = 0;

        result = lcm(A,B);

        System.out.println(result);
    }

    public static int gcd(int A, int B) {
        while (B > 0) {
            int tmp = B;
            B = A % B;
            A = tmp;
        }
        return A;
    }

    public static int lcm(int A, int B) {
        return A * B / gcd(A,B);
    }
}
