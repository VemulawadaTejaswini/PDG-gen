import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
        }

        int cnt = 1;
        int mod = 0;
        for (int i = 1; i < N; i++) {
            int m;
            if (A[i - 1] < A[i]) {
                m = 1;
            } else if (A[i -1] > A[i]) {
                m = -1;
            } else {
                m = 0;
            }

            if (mod != 0 && m != 0 && mod != m) {
                cnt++;
                mod = 0;
            } else if (mod == 0) {
                mod = m;
            }
        }

        System.out.println(cnt);
    }
}