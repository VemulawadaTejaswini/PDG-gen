import java.util.Scanner;

// https://atcoder.jp/contests/abc142/tasks/abc142_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		int[] result = new int[N];
		for(int i=0;i<N;i++) {
			result[sc.nextInt()-1] = i+1;
		}

		sc.close();

		for(int i=0;i<N;i++) {
			if(i!=N-1) {
				System.out.print(result[i]+" ");
			}else {
				System.out.print(result[i]);
			}

		}

	}

}
