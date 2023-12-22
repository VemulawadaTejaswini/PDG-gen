import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[M];
        int sum = 0;
        for(int i = 0; i < M; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }
        if(N - sum < 0) {
            System.out.println(-1);
        }else{
            System.out.println(N - sum);
        }

        return;
    }
}