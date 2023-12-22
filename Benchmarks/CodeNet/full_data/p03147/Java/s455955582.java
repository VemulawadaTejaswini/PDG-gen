import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            while (h[i] != 0) {
                for (int j = i; j < N; j++) {
                    if (h[j] == 0) break;
                    h[j]--;
                }
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
