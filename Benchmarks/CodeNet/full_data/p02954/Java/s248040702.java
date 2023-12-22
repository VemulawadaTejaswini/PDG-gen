import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int[] ans = new int[S.length()];
		
		int rIndex = 0;
		int lIndex = S.length()-1;
		int rCount = 0;
		int lCount = 0;
		
		boolean rPhase = true;
		
		for(int i=0; i<S.length(); i++) {
			if(rPhase) {
				if(S.charAt(i)=='L') {
					rIndex = i - 1;
					lIndex = i;
					rPhase = false;
					lCount++;
				}else {
					rCount ++;
				}
			}else{
				if(S.charAt(i)=='R') {
					//record
					ans[rIndex] = (rCount - rCount/2) + lCount/2;
					ans[lIndex] = rCount/2 + (lCount - lCount/2);
					//reset
					rCount = 1;
					lCount = 0;
					rPhase = true;
				}else {
					lCount ++;
				}
			}
			
		}
		//record
		ans[rIndex] = (rCount - rCount/2) + lCount/2;
		ans[lIndex] = rCount/2 + (lCount - lCount/2);
		
		//print
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]);
			if(i==ans.length-1) {
				System.out.println();
			}else {
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}