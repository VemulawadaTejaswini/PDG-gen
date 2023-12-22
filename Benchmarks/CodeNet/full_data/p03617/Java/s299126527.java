import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int H = sc.nextInt();
		int S = sc.nextInt();
		int D = sc.nextInt();
		int N = sc.nextInt();
		int C;
		
		H=Math.min(2*Q, H);
		S=Math.min(2*H, S);
		
		if(2*S<D) {
			C=S*N;
		}
		else {
			C=N/2*D+N%2*S;
		}
		System.out.println(C);
	}
}
