import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int 	N = sc.nextInt(),
				M = sc.nextInt(),
				count[] = new int[N],
				ans1 = 0,
				ans2 = 0;
		
		boolean f[] = new boolean[N];
		Arrays.fill(f, true);
		
		for (int i = 0; i < M; i++) {
			int QN = sc.nextInt()-1;
			String result = sc.next();
			if (f[QN]) {
				if (result.equals("WA")) {
					count[QN]++;
				} 
				if (result.equals("AC")) {
					ans1 += count[QN];
					ans2++;
					f[QN] = false;
				}
			}
		}
		System.out.println(ans2 + " " + ans1);
	}
}