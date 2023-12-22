import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int count = 0;
        int sum = 0;

        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }

        double th = sum / (4 * M);

        for(int i = 0; i < N; i++) {
            if(A[i] >= th) {
                count++;
            }
        }

        if(count > M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}