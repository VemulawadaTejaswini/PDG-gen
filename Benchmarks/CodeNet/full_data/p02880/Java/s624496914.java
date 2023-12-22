import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div = 0;

        for (int i = 1; i < 10; i++) {
            if (N % i == 0) {
                div = N / i;
                for (int j = 9; j < 0; j--) {
                    if (div * j == N) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
}