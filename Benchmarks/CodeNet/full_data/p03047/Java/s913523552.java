import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(consecutive(N, K));;
    }

    protected static int consecutive(int N, int K) {
        int consecutive = N-K+1;

        return consecutive;
    }
}