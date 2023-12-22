import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        boolean flg = true;
        while (flg) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 != 0) {
                    flg = false;
                    break;
                }
                A[j] = A[j] / 2;
            }
            if (flg) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
