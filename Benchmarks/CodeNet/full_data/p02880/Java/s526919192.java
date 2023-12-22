import java.util.Scanner;

// https://atcoder.jp/contests/abc144/tasks/abc144_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		boolean flag = false;

		if(N>81) {

		}else {
			for(int i=1;i<=9;i++) {
				if(N%i==0&&N/i<10) {
					flag = true;
					break;
				}
			}
		}

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



//		int[] array = new int[N];
//		for(int i=0;i<N;i++) {
//			array[i]=sc.nextInt();
//		}
//		sc.close();
	}
}
