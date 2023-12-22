import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int all_point = 0;
        for (int i = 0; i < N; i++) {
            all_point += A[i];
        }
        int point = all_point / (4 * M);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] >= point) {
                count += 1;
            }
        }
        if (M <= count) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}