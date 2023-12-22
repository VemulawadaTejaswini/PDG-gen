import java.util.Scanner;

public class Main {
  static int ans = 0;
	static int N;
	static int[] V;
	static int[] C;
  public static void main(String[] args) {
	int i;
	Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    V = new int[N];
    C = new int[N];
    for (i = 0; i < N; i++) {
    	V[i] = sc.nextInt();
    }
    for (i = 0; i < N; i++) {
    	C[i] = sc.nextInt();
    }
    Main.keisan(0, 0, 0);
    System.out.println(ans);
  }
  static void keisan(int now, int x, int y) {
	if (now >= N) {
		return;
	}
	int x1 = x + V[now];
	int y1 = y + C[now];
	ans = Math.max(ans, x1-y1);
	ans = Math.max(ans, x-y);
	keisan(now+1, x, y);
	keisan(now+1, x1, y1);
  }
}