import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int price = 0;

        if (N <= K) {
            price = X * N;
        } else if (N > K) {
            price = Y * (N - K) + X * K;
        }

        System.out.println(price);
    }
}