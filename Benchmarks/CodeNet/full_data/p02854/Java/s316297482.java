import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        long sum = 0;
        long half = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
            sum += A[i];
            B[i] = sum;
        }
        half = sum / 2;

        int i =0;
        int j = N - 1;
        long left = 0;
        long right = 0;
        while( i <= j) {
            if(left < right) {
                left += A[i];
                i++;
            }else {
                right += A[j];
                j--;
            }
        }
        long ans = Math.abs(left - right);

        System.out.println(ans);
    }

}