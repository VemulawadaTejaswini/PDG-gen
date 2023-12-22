import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		double t = sc.nextLong();
		double a = sc.nextLong();
		int idx = 0;
		double min = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			double d = Math.abs(a - (t - sc.nextLong() * 0.006));
			if(min > d) {
				min = d;
				idx = i;
			}
		}
		System.out.println(idx);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
