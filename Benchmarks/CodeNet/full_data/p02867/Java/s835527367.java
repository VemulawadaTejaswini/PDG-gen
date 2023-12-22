
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for(int i = 0; i < A.length; i++) {
			String str = sc.next();
			A[i] = Integer.parseInt(str);
		}

		for(int i = 0; i < B.length; i++) {
			String str = sc.next();
			B[i] = Integer.parseInt(str);
		}


		boolean flag = true;
		int counter = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] <= B[i]) {
				flag = true;
			}else {
				for (int j = 0; j < A.length; j++) {
					if(A[i] <= B[j] && A[j] <= B[i]) {
						int tmp = B[j];
						B[j] = B[i];
						B[i] = tmp;
						counter++;
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
			}
		}

		if(flag && counter <= N - 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
