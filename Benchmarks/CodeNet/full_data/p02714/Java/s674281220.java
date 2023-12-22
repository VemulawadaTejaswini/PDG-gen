import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		String S = input.nextLine();
		System.out.println(SOLVE(N,S));
	}
	public static long SOLVE(int N, String S) {
		if (N<=3) return 0;
		long cnt = 0;
		for (int gap = 1; gap <= N/2; gap++) {
			for (int start = 0; start < N-gap-1; start++) {
				int middle = start+gap;
				for (int end = middle+1; end<N; end++) {
					if (S.charAt(start)!=S.charAt(middle)&&S.charAt(start)!=S.charAt(end)
						&&S.charAt(end)!=S.charAt(middle)&&end!=(middle+gap)) {
						cnt++;
					}
				}
			}
		} 
		for (int gap = N/2+1; gap<=N-2; gap++) {
			for (int start = 0; start < N-gap-1; start++) {
				for (int end = start+gap+1; end < N; end++) {
					if (S.charAt(start)!=S.charAt(start+gap)&&S.charAt(start)!=S.charAt(end)
							&&S.charAt(end)!=S.charAt(start+gap)) {
							cnt++;
						}
				}
			}
		}
		return cnt;
	}
}