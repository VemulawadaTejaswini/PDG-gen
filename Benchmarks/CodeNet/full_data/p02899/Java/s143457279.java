import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[scanner.nextInt() - 1] = i;
        }
        for(int i = 0; i < N; i++) {
            System.out.print(A[i] + 1);
            System.out.print(" ");
        }
    }
}
