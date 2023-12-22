import java.util.Scanner;

public class sumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;

        if (N == 0 || N == 2) {
            System.out.println(M);
            return;
        }

        while (N != 0) {
            sum += --N;
        }

        System.out.println(sum + M);
    }
}