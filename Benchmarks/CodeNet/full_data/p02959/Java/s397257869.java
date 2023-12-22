import java.util.Scanner;

public class Main {
    public static void main(String[] atrgs){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for(int i = 0; i < N+1; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        int count= 0;
        for(int i = 0; i < N; i++) {
            int min = Math.min(A[i], B[i]);
            count += min;
            if(B[i] - min > 0) {
                int mmin = Math.min(A[i+1], B[i]);
                count += mmin;
                A[i+1] -= mmin;
            }
        }
        System.out.println(count);
    }
}
