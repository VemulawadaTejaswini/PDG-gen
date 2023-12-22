

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N =scanner.nextInt();

		int[] P =new int[N];

		for (int i =0;i<N;i++) {
			P[i]=scanner.nextInt();
		}

		int max =0;
		for(int i=0;i<N;i++) {
			if(P[i]==(max+1)) {
				max+=1;
			}
		}

		int min =N+1;
		for(int j=N-1;j>=0;j--) {
			if(P[j]==(min-1)) {
				min-=1;
			}
		}

		min = N-min+1;

		int ans;
		ans=(max>min)?N-max:N-min;
		System.out.println(ans);

	}

}
