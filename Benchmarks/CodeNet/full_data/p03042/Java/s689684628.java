import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	void doIt() {
		int s = sc.nextInt();
		int fir = s / 100;
		int sec = s % 100;
		if(fir < 13 && fir > 0) {
			if(sec < 13 && sec > 0) {
				System.out.println("AMBIGUOUS");
			}
			else System.out.println("MMYY");
		}
		else {
			if(sec < 13 && sec > 0) {
				System.out.println("YYMM");
			}
			else System.out.println("NA");
		}
	}
	

	public static void main(String[] args) {
		new Main().doIt();
	}
}
