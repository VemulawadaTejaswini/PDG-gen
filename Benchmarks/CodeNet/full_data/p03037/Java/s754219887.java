import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int max[] = {0, 0};
        int min[] = {100000, 100000};

        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            if (L > R) {
                if (max[0] < L) {
                    max[0] = L;
                    max[1] = R;
                }
                if (min[0] > R) {
                    min[0] = R;
                    min[1] = L;
                }
            } else {
                if (max[0] < R) {
                    max[0] = R;
                    max[1] = L;
                }
                if (min[0] > L) {
                    min[0] = L;
                    min[1] = R;
                }
            }
        }

        if (max[1] == min[1]) {
            System.out.println(1);
        } else if (min[1] - max[1] > 0) {
            System.out.println(min[1] - max[1] + 1);
        } else {
            System.out.println(0);
        }
    }
}
