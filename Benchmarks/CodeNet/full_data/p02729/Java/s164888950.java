import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),M = sc.nextInt();
		if(N==0) {
			N = 1;
		}
		if(M==0) {
			M = 1;
		}
		int ans = N*(N-1)/2+M*(M-1)/2;
		System.out.println(ans);
	}

}
