import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] black = new int[n];
		int[] white = new int[n];

		for (int i=0;i<2*n;i++) {
			char c = sc.next().charAt(0);
			int a = sc.nextInt()-1;
			if (c == 'B') {
				black[a] = i;
			} else {
				white[a] = i;
			}
		}

		int blackCount = 0;
		int whiteCount = 0;

		int[] black2 = new int[n];
		int[] white2 = new int[n];

		while(blackCount < n || whiteCount < n) {
			if (whiteCount == n || (blackCount < n && black[blackCount] < white[whiteCount])) {
				black2[blackCount] = blackCount + whiteCount;
				blackCount++;
			} else {
				white2[whiteCount] = blackCount + whiteCount;
				whiteCount++;
			}
		}
		int change = 0;
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if ((black[i]-black[j])*(black2[i]-black2[j]) < 0) {
					change++;
				}
				if ((white[i]-white[j])*(white2[i]-white2[j]) < 0) {
					change++;
				}
			}
		}

		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {

				if ((black[i]-white[j])*(black2[i]-white2[j]) < 0) {
					change++;
				}

			}
		}

		System.out.println(change);
	}

}
