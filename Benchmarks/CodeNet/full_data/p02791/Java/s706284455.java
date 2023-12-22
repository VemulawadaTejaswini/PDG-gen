import java.util.Scanner;

public class Main	 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P[] = new int[N];
		int sum = 1;
		boolean flag = true;
		for(int i=0; i < N; i++) {
		P[i] = scan.nextInt();
		}
		int pre_min = P[0];

		for(int i=1; i<N; i++) {
			flag = true;
			if(P[i] < pre_min) {
				sum +=1;
				pre_min = P[i];
			}


			/*
			if(pre_min > P[i]) {
				pre_min = P[i];
			}else {
			sum += 1;
			}
			*/
		}
/*
		for(int i=1; i<N; i++) {
			loop: for(int j=1; j<i+1; j++) {
			flag = true;
			c
			/*
			if(P[i] > P[j-1]) {
				flag = false;
				break;
			}

			if(P[i] == 0) {
				flag = true;
				break;
			}

		}
			if(flag == true) {
				sum += 1;
				pre_min = P[i];
			}
		}
		System.out.print(sum);
*/

		System.out.print(sum);
	}
}
