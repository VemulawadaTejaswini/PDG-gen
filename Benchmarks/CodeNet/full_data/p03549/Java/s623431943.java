package atcoder078_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int roops = 0;
		int warukazu = 1;
		int beforeTime = 20;
		int afterTime = 0;

		while(beforeTime != afterTime) {
			beforeTime = afterTime;
			roops++;
			warukazu = warukazu *2;
			afterTime = afterTime + roops*(100*n + 1800*m)/warukazu;

		}
		int time = beforeTime;

		System.out.print(time);

	}

}
