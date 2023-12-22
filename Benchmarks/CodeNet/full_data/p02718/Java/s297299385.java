import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int count = 0;
        int all = 0;

        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            all += A[i];
        }

        for(int i = 0; i < N; i++) {
            if(A[i] >= all / 4 / M) {
                count++;
            }
        }

        if(count >= M) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}