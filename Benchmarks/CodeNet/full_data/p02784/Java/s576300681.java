import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        stdIn.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        if (sum >= H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}