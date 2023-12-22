import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = in.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (canSee(i, H)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean canSee(int i, int[] H) {
        for (int j = 0; j < i; j++) {
            if (H[j] > H[i]) {
                return false;
            }
        }
        return true;
    }
}
