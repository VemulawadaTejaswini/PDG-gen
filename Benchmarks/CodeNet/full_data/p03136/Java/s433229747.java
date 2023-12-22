import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxL =0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			int L = sc.nextInt();
			//Lを合計する
			sum +=L;;
			//Lの最大値を出す
			maxL = Math.max(maxL, L);
		}
		//Lの最大値がLの合計から最大を引いた数より小さければYes
		if(maxL<sum-maxL) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}