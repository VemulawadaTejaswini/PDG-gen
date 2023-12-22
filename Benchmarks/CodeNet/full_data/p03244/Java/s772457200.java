import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//File file = new File("top2_3.txt");
		//FileInputStream fi = new FileInputStream(file);
		//Scanner sc = new Scanner(fi);

		int n = sc.nextInt();

		int[] oddCnt = new int[100001];
		int[] evenCnt = new int[100001];

		for (int i = 0; i < 100001; i++) {
			oddCnt[i] = 0;
			evenCnt[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			if (i % 2 == 0) {
				evenCnt[v]++;
			} else {
				oddCnt[v]++;
			}
		}

		int oddMax = 0;
		int oddMaxId = 0;
		int odd2ndMax = 0;
		int evenMax = 0;
		int evenMaxId = 0;
		int even2ndMax = 0;

		for (int i = 0; i < 100001; i++) {
			if (evenMax <= evenCnt[i]) {
				even2ndMax = evenMax;
				evenMax = evenCnt[i];
				evenMaxId = i;
			} else if (even2ndMax <= evenCnt[i]) {
				even2ndMax = evenCnt[i];
			}
			if (oddMax <= oddCnt[i]) {
				odd2ndMax = oddMax;
				oddMax = oddCnt[i];
				oddMaxId = i;
			} else if (odd2ndMax <= oddCnt[i]) {
				odd2ndMax = oddCnt[i];
			}
		}

		if (evenMaxId != oddMaxId) {
			//System.out.println(1 + ":" + n + ":" + evenMaxId + ":" + oddMaxId);
			System.out.println(n - evenMax - oddMax);
		} else if (even2ndMax > odd2ndMax) {
			//System.out.println(2 + ":" + n + ":" + evenMaxId + ":" + oddMaxId);
			System.out.println(n - even2ndMax - oddMax);
		} else {
			//System.out.println(3 + ":" + n + ":" + evenMax + ":" + oddMax + ":" + even2ndMax + ":" + odd2ndMax);
			System.out.println(n - evenMax - odd2ndMax);
		}
		sc.close();
	}
}
