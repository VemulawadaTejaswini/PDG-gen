import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        while (true) {
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) {
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
            for (int i = 0; i < N; i++) {
                A[i] = A[i] / 2;

            }
            cnt++;
        }
        System.out.println(cnt);
    }
}