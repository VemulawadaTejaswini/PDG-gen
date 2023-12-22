import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int [N];
        for (int i = 0; i < N; ++i) {
            H[i] = sc.nextInt();
        }

        double[] dif = new double [N];
        int ans = 0;
        for (int i = 0; i < N; ++i) {
            dif[i] = Math.abs(T - H[i] * 0.006 - A);
            if(i > 0 && dif[i] < dif[i - 1]) {
                ans = i + 1;
            }
        }

        System.out.println(ans);
	}
}
