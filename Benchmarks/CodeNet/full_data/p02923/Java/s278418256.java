import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		Arrays.setAll(H, i->sc.nextInt());
		int ans = 0;
		int tmp = 0;
		
		for (int j=0; j<N-i-1; j++) {
			if (H[i+j] >= H[i+j+1]) {
				tmp++;
			} else {
				break;
			}
		}
		ans = Math.max(ans, tmp);
		System.out.println(ans);
	}
}
