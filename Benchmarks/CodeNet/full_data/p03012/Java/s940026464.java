
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = scanner.nextInt();
        }

        int S1 = 0;
        int S2 = 0;
        int abs = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            S1 = 0;
            S2 = 0;
            for(int s1i = 0; s1i < i; s1i++){
                S1 += W[s1i];
            }

            for(int s2i = i; s2i < N; s2i++){
                S2 += W[s2i];
            }

            int tmp = Math.abs(S1 - S2);
            if(tmp < abs) {
                abs = tmp;
            }

        }

        System.out.println(abs);

    }
}
