import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] h = new int[n];
		int[] hDiff = new int[n];
		int hDiffTotal = 0;
		
		for (int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		
		hDiff[0] = h[0];
		
		for (int i = 1; i < n; i++) {
			hDiff[i] = h[i] - h[i - 1];
			
			if (hDiff[i] < 0) {
				hDiff[i] = 0;
			}
			
		}
		
		for (int i = 0; i < n; i++) {
			hDiffTotal += hDiff[i];
		}
		
		System.out.println(hDiffTotal);
	
	}
}