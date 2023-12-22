

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long voteT = sc.nextLong();
		long voteA = sc.nextLong();
		int prevT = (int)voteT;
		int prevA = (int)voteA;
		for(int i = 1; i < n; i++){
			int t = sc.nextInt();
			int a = sc.nextInt();

//			System.out.println(prevT +" "+ prevA+" " + t + " " + a);
			if(prevT == t && prevA == a){
				continue;
			}

			if(voteT % t != 0){
				voteT += t - (voteT % t);
			}

			if(voteA % a != 0){
				voteA += a - (voteA % a);
			}

			if(voteT < voteA/a*t){
				voteT = voteA/a*t;
			}
			else{
				voteA = voteT/t*a;
			}

			prevT = t;
			prevA = a;
//			System.out.println(voteT + " " + voteA);
		}

		System.out.println(voteT + voteA);
	}

}
