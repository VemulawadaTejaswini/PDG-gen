import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		long ans = 0;
		int[] sumr = new int[N+1];
		int[] sumg = new int[N+1];
		int[] sumb  = new int[N+1];
		for(int i = 1; i <= N; i++) {
			sumr[i] = sumr[i-1];
			sumg[i] = sumg[i-1];
			sumb[i] = sumb[i-1];
			if(S.charAt(i-1) == 'R')
				sumr[i]++;
			else if(S.charAt(i-1) == 'G')
				sumg[i]++;
			else
				sumb[i]++;
		}
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == 'R') {
				for(int j = i+1; j < N; j++) {
					if(S.charAt(j) == 'G') {
						ans += sumb[N] - sumb[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'B')
								ans--;
					}
					else if(S.charAt(j) == 'B') {
						ans += sumg[N] - sumg[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'G')
								ans--;
					}
				}
			}
			else if(S.charAt(i) == 'G') {
				for(int j = i+1; j < N; j++) {
					if(S.charAt(j) == 'R') {
						ans += sumb[N] - sumb[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'B')
								ans--;
					}
					else if(S.charAt(j) == 'B') {
						ans += sumr[N] - sumr[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'R')
								ans--;
					}
				}
			}
			else {
				for(int j = i+1; j < N; j++) {
					if(S.charAt(j) == 'R') {
						ans += sumg[N] - sumg[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'G')
								ans--;
					}
					else if(S.charAt(j) == 'G') {
						ans += sumr[N] - sumr[j];
						if(2*j-i < N)
							if(S.charAt(2*j-i) == 'R')
								ans--;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
