import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        for (int i = 1; i < N; i++) {
            int diff = H[i] - H[i - 1];
            if (diff == 0) {
            } else if (diff > 0) {
                H[i] = H[i] - 1;
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}