import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int [N + 1];
        H[0] = 0;
        for (int i = 1; i <= N; ++i) {
            H[i] = sc.nextInt();
        }

        double[] dif = new double [N + 1];
        dif[0] = 1000;
        int ans = 1;
        for (int i = 1; i <= N; ++i) {
            dif[i] = Math.abs(T - H[i] * 0.006 - A);
            if(dif[i] < dif[i - 1]) {
                ans = i;
            }
        }

        System.out.println(ans);
	}
}
