
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Cake[][] dp = new Cake[n + 1][m + 1];
		Cake[] kind = new Cake[n + 1];
		for(int i = 1; i < n + 1; i++) {
			kind[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
		}
		for(int i = 0; i < n + 1; i++) {
			dp[i][0] = new Cake(0, 0, 0);
		}
		for(int i = 0; i < m + 1; i++) {
			dp[0][i] = new Cake(0, 0, 0);
		}
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				Cake tmp = Sum(dp[i - 1][j - 1], kind[i]);
				if(Calc(dp[i - 1][j]) < Calc(tmp)) {
					dp[i][j] = tmp;
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		long ans = Calc(dp[n][m]);
		System.out.println(ans);

	}

	public static long Calc(Cake a) {
		return Math.abs(a.getBea()) + Math.abs(a.getDeli()) + Math.abs(a.getPop());
	}

	public static Cake Sum(Cake a, Cake b) {
		return new Cake(a.getBea() + b.getBea(), a.getDeli() + b.getDeli(), a.getPop() + b.getPop());
	}

}

class Cake {
	private long bea;
	private long deli;
	private long pop;

	protected Cake(long bea, long deli, long pop) {
		super();
		this.bea = bea;
		this.deli = deli;
		this.pop = pop;
	}

	public long getBea() {
		return bea;
	}

	public void setBea(long bea) {
		this.bea = bea;
	}

	public long getDeli() {
		return deli;
	}

	public void setDeli(long deli) {
		this.deli = deli;
	}

	public long getPop() {
		return pop;
	}

	public void setPop(long pop) {
		this.pop = pop;
	}

}
