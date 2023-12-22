
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) p[i] = sc.nextInt();

        for (int j = 1; j < N - 1; j++) {
            if (p[j] < p[j + 1] && p[j] > p[j - 1])
                cnt++;
            else if (p[j] > p[j + 1] && p[j] < p[j - 1])
                cnt++;
        }

        System.out.println(cnt);

    }
}

