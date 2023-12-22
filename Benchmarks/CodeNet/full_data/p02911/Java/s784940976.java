import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < Q; i++) {
            int j = scanner.nextInt();
            A[j-1]++;
        }

        for(int i = 0; i < N; i++) {
            if(A[i] + K > Q) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
