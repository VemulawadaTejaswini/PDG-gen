import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt(),
				ans[] = new int[N],
				M =sc.nextInt();
		Arrays.fill(ans, -1);
		boolean f = true;
		for (int i = 0; i < M; i++) {
			int temp = sc.nextInt(),
					temp1 = sc.nextInt();
			if (ans[temp-1]!= -1) {
				if(ans[temp-1] != temp1) {
					f = false;
					break;
				}
			}else
			ans[temp-1]=temp1;
		}
		if (ans[0] == 0)
			f = false;
		if (f) {
			for (int i = 0; i < N; i++) {
				if(ans[i]==-1) {
					System.out.print(0);
					continue;
				}
				System.out.print(ans[i]);
			}
		} else {
			System.out.println(-1);
		}
	}
}