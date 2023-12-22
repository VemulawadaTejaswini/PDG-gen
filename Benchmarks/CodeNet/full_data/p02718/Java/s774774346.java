package begin20200404;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long totalNum = 0;

		ArrayList<Integer> numListN = new ArrayList<Integer>();
		ArrayList<Integer> numListM = new ArrayList<Integer>();
//		System.out.println(numListN);

		for(int i = 1;i <= N;i++) {
			int num = sc.nextInt();
			numListN.add(num);
			totalNum += num;
		}
		sc.close();

		//最大値の取得
		for(int j = 0;j < M; j++) {
			int max = 0;
			int maxLocation = 0;
			for(int i = 0;i < numListN.size(); i++) {
				if(max < numListN.get(i)) {
					max = numListN.get(i);
					maxLocation = i;
				}
			}
			if(max != 0) {
				numListM.add(max);
				numListN.remove(maxLocation);
			}
		}

//		System.out.println(numListM);

		String answer = "Yes";
		for(int j = 0;j < M; j++) {
			if(numListM.get(j) < (totalNum/(4*M))) {
//				System.out.println(numListM.get(j));
				answer = "No";
			}
		}
//		System.out.println(totalNum);
		System.out.println(answer);
	}

}
