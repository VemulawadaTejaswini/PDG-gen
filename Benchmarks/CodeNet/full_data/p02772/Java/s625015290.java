import java.util.Scanner;

// https://atcoder.jp/contests/abc155/tasks/abc155_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		boolean flag = true;
		for(int i=0;i<N;i++) {
			int n = array[i];
			if(n%2==0) {
				if((n%3==0)||(n%5==0)) {

				}else {
					flag = false;
				}
			}
		}

		if(flag) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}



	}

}
