import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long b;
		long ans = Long.MAX_VALUE;
		
		int[] ary = new int[n];
		for(int i = 0; i< n; i++) {
			ary[i]  = scanner.nextInt();
		}
//
		long tmpMin = Long.MAX_VALUE;
		long tmpMax = Long.MIN_VALUE;
		for(int k = 0;  k < n; k++) {
			long tmp = ary[k]-k-1;
			if(tmp < tmpMin) tmpMin = tmp;
			if(tmp > tmpMax) tmpMax = tmp;
		}
		
//		b = tmp / n;
		// 答えが最小か
		for(b = tmpMin; b <= tmpMax; b++) {
			long ans2 = 0;
			for(int r = 0; r < n; r++) {
				ans2 += Math.abs(ary[r]-(b+r+1));
			}
			if(ans2 < ans) ans =ans2;
		}
		System.out.println(ans);
//		if(b >= 0) {
//			b++;
//		}else {
//			b--;
//		}
//		for(int r = 0; r < n; r++) {
//			ans2 += Math.abs(ary[r]-(b+r+1));
//		}
//		if(b >= 0) {
//			b -= 2;
//		}else {
//			b += 2;
//		}
//		long ans3 = 0;
//		for(int r = 0; r < n; r++) {
//			ans3 += Math.abs(ary[r]-(b+r+1));
//		}
//
//		System.out.println(Math.min(ans3,Math.min(ans, ans2)));
//
	}

}