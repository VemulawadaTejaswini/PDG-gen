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
		int cntR = 0;
		int cntG = 0;
		int cntB = 0;
		for (int i = N/2+1; i < N; i++) {
			if (S.charAt(i)=='R') cntR++;
			else if (S.charAt(i)=='G') cntG++;
			else if (S.charAt(i)=='B') cntB++;
		}
		//System.out.println(cntR);
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
			if (S.charAt(gap)=='R') cntR--;
			if (S.charAt(gap)=='G') cntG--;
			if (S.charAt(gap)=='B') cntB--;
			int tempR = cntR;
			int tempG = cntG;
			int tempB = cntB;
			for (int start = 0; start < N-gap; start++) {
				int middle = start+gap;
				if (S.charAt(middle)!=S.charAt(start)) {
					if (start>0) {
						if (S.charAt(start)=='R'&&S.charAt(middle)=='G'||S.charAt(start)=='G'&&S.charAt(middle)=='R') {
							cnt+=tempB;
							if (S.charAt(middle)=='R') tempR--;
							else if (S.charAt(middle)=='G') tempG--;
						}
						if (S.charAt(start)=='R'&&S.charAt(middle)=='B'||S.charAt(start)=='B'&&S.charAt(middle)=='R') {
							cnt+=tempG;
							if (S.charAt(middle)=='B') tempB--;
							else if (S.charAt(middle)=='R') tempR--;
						}
						if (S.charAt(start)=='B'&&S.charAt(middle)=='G'||S.charAt(start)=='G'&&S.charAt(middle)=='B') {
							cnt+=tempR;
							if (S.charAt(middle)=='B') tempB--;
							else if (S.charAt(middle)=='G') tempG--;
						}
					}
				}
			}
		}
		return cnt;
	}
}