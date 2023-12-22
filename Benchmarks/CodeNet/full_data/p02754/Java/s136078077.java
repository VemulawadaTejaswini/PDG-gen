import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long result;

        if(A == 0) {
            result = 0;
        } else if (A + B < N) {
            result = A + (N - (A+B));
        } else {
            result = A;
        }

        System.out.println(result);
    }
}