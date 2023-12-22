import java.util.Scanner;

public class Main {
	private static Main instance = new Main();
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		instance.solve();
	}
	
	private void solve() {
		int n = scanner.nextInt();
		double tVotes = scanner.nextDouble();
		double aVotes = scanner.nextDouble();
		
		for(int i=1;i<n;i++) {
			double t = scanner.nextDouble();
			double a = scanner.nextDouble();
			
			// tとaは互いに素
			if(t == a) {
				if(tVotes > aVotes) {
					aVotes = tVotes;
				} else {
					tVotes = aVotes;
				}
			} else if(t > a) {
				double modA = aVotes % a;
				if(modA > 0) {
					aVotes = aVotes + (a - modA);
				}
				while(aVotes / a * t < tVotes) {
					aVotes += a;
				}
				tVotes = aVotes / a * t;
			} else {
				double modT = tVotes % t;
				if(modT > 0) {
					tVotes = tVotes + (t - modT);
				}
				while(tVotes / t * a < aVotes) {
					tVotes += t;
				}
				aVotes = tVotes / t * a;
			}
		}
		System.out.printf("%d", (int)(tVotes+aVotes));
	}
}
