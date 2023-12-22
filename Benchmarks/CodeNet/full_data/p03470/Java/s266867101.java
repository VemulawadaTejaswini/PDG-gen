import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int moti[] = new int[N];

		int flg = 0;

		int answer = 0;

		for (int i=0; i<N; i++) {
			moti[i] = sc.nextInt();
		}

		//同じ数字がなければ、１段追加。
		for (int i=0; i<N; i++) {
			for(int k=0; k<N; k++) {
				if (i == k) {
					continue;
				}
				if (moti[i] == moti[k]) {
					flg = 0;
					break;
				}
				flg = 1;
			}
			answer = answer + flg;
		}
		if (answer == 0) {
			answer = 1;
		}
		System.out.println(answer);
	}
}