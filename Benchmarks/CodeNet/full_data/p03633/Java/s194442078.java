import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = 0;
		long[] clockInfo = new long[n];
		for(int i =0;i <n;i++) {
			clockInfo[i] = sc.nextLong();
		}
		answer = clockInfo[0];
		for(int i =1;i <n;i++) {
			// 最小公倍数を求めていく
			long big = answer;
			long small = clockInfo[i];
			if(big < small) {
				big = clockInfo[i];
				small = answer;
			}

			if(big % small ==0) {
				answer = big;
				continue;
			}

			long amari =  (big % small);
			long amariTmp = amari;
			long smallTmp = small;
			int count = 1;
			for(int j =2;j <=small;j++ ) {
				amariTmp+= amari;
				count++;
				if(smallTmp< amariTmp) {
					smallTmp+= small;
				}
				if(smallTmp == amariTmp) {
					answer =  big * count;
					continue;
				}
			}
		}
		System.out.println(answer);

	}
}