import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] peopleCount = new int [13];
		for (int i=0;i<n;i++) {
			peopleCount[sc.nextInt()]++;
		}

		System.out.println(solve(peopleCount));

	}

	static int solve(int[] peopleCount) {
		if (peopleCount[0]>0) {
			return 0;
		}
		for (int i=1;i<=11;i++) {
			if (peopleCount[i]>2) {
				return 0;
			}
		}
		if (peopleCount[12]>1) {
			return 0;
		}

		int ans = 0;

		for (int i=0;i<2048;i++) {
			boolean[] used = new boolean[24];
			used[12]=true;
			for (int j=1;j<=11;j++) {
				if (peopleCount[j]==2) {
					used[12+j]=true;
					used[12-j]=true;
				} else if (peopleCount[j]==1) {
					if ((i & (1<<(j-1))) > 0) {
						used[12+j]=true;
					} else {
						used[12-j]=true;
					}
				}
			}
			if(peopleCount[12]==1) {
				used[0]=true;
			}
			int s = 24;
			int pos = -1;
			for(int j=0;j<48;j++) {
				if(used[j%24]) {
					if(pos >= 0) {
						s=Math.min(j-pos, s);
					}
					pos = j;
				}
			}

			ans = Math.max(s, ans);

		}
		return ans;
	}

}
