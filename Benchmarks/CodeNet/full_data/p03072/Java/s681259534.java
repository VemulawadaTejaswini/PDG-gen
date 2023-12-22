import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int max = H[0];
        int cnt = 1;

        for (int i = 1; i < N ; i++) {
            if (max <= H[i]) {
                max = H[i];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
