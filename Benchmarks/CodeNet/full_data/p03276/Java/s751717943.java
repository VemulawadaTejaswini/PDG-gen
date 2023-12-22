import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int lastMinus = -1;
		int[] candles = new int[n];
		for (int i=0; i<n; i++){
			candles[i] = scanner.nextInt();
			if (candles[i]<0) lastMinus++;
		}
		int ans = Integer.MAX_VALUE;
		int minI;
		int maxI = Math.min(n-1, lastMinus+k);
		if (lastMinus<n-1 && candles[lastMinus+1]==0) {
			minI = Math.max(0, lastMinus-k+2);
		}else {
			minI = Math.max(0, lastMinus-k+1);
		}
		for (int i=minI; i<=maxI-k+1; i++){
			int left = candles[i];
			int right = candles[i+k-1];
			if (left<0 && right<=0) ans = Math.min(ans, -left);
			else if (0<=left && 0<right) ans = Math.min(ans, right);
			else ans = Math.min(ans, right-left+Math.min(-left, right));
		}
		System.out.println(ans);
	}
}