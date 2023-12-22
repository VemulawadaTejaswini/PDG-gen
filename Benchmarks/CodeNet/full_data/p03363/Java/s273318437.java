import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        scanner.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            long sum = A[i];
            for (int j = i + 1; j < N; j++) {
                sum += A[j];
                if (sum == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}