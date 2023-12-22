import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println(Math.abs(A[2] - A[1]) + Math.abs(A[1] - A[0]));
    }
}
