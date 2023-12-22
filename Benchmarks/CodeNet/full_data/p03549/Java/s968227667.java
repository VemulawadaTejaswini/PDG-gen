package atcoder078_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double jousuu = Math.pow(0.5, (double)m);
		double warukazu = 1;
		double beforeTime = 20;
		double afterTime = 0;
		double ruiseki = 1;
		int teisuu = 1*n + 18*m;

		while((int)beforeTime != (int)afterTime) {
			beforeTime = afterTime;
			warukazu = ruiseki * jousuu;
			afterTime = afterTime +teisuu*warukazu;
			ruiseki = ruiseki - warukazu;

		}
		int time = (int)beforeTime * 100;

		System.out.print(time);

	}

}
