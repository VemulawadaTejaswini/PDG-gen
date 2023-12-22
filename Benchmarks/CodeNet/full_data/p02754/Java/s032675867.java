import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();//b
        int B = scanner.nextInt();//r
        int sum = A+B;
        int a = N / sum;
        int sumA = a * A;
        int c = Math.min(N % sum, A);
        System.out.println(sumA + c);
    }
}