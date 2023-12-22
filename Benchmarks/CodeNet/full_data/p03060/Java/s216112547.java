import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = s.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] > C[i])
                ans += V[i] - C[i];
        }
        System.out.print(ans);
    }
}
