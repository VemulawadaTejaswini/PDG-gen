import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int total = 0;
		double intaverage,doubleaverage;
		int finalaverage;
		int minvalue = 0;
		for(int i = 0;i < n;i++) {
			x[i] = sc.nextInt();
			total += x[i];
		}
		intaverage = total / n;
		doubleaverage = (double)total/n;

		if(intaverage + 0.5 < doubleaverage) {
			finalaverage = (int)intaverage + 1;
		}else {
			finalaverage = (int)intaverage;
		}
		for(int i = 0;i < n;i++) {
			if(minvalue > x[i]) {
				minvalue += (int)Math.pow(finalaverage-x[i], 2);
			}else {
				minvalue += (int)Math.pow(x[i]-finalaverage, 2);
			}
		}
		System.out.println(minvalue);
	}

}